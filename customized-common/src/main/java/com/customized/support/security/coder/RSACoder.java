/**
 * 2011-01-11
 */
package com.customized.support.security.coder;

import com.customized.support.security.SecurityCoder;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;

import com.google.common.collect.Maps;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * RSA安全编码组件
 * 
 * @author ShenHuaJie
 * @version 1.0
 * @since 1.0
 */
public abstract class RSACoder extends SecurityCoder {

	/**
	 * 数字签名 密钥算法
	 */
	public static final String KEY_ALGORITHM = "RSA";

	/**
	 * 数字签名 签名/验证算法
	 */
	public static final String SIGNATURE_ALGORITHM = "SHA1withRSA";

	/**
	 * 公钥
	 */
	private static final String PUBLIC_KEY = "RSAPublicKey";

	/**
	 * 私钥
	 */
	private static final String PRIVATE_KEY = "RSAPrivateKey";

	/**
	 * RSA密钥长度 默认1024位， 密钥长度必须是64的倍数， 范围在512至65536位之间。
	 */
	private static final int KEY_SIZE = 512;

	/**
	 * 签名
	 * 
	 * @param data 待签名数据
	 * @param privateKey 私钥
	 * @return byte[] 数字签名
	 * @throws Exception
	 */
	public static String sign(String data, byte[] privateKey) throws Exception {
		// 转换私钥材料
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(privateKey);
		// 实例化密钥工厂
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		// 取私钥匙对象
		PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);
		// 实例化Signature
		Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
		// 初始化Signature
		signature.initSign(priKey);
		// 更新
		signature.update(decryptBASE64(data));
		// 签名
		return encryptBASE64(signature.sign());
	}

	/**
	 * 校验
	 * 
	 * @param data 待校验数据
	 * @param publicKey 公钥
	 * @param sign 数字签名
	 * @return boolean 校验成功返回true 失败返回false
	 * @throws Exception
	 */
	public static boolean verify(String data, byte[] publicKey, String sign) throws Exception {
		// 转换公钥材料
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKey);
		// 实例化密钥工厂
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		// 生成公钥
		PublicKey pubKey = keyFactory.generatePublic(keySpec);
		// 实例化Signature
		Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
		// 初始化Signature
		signature.initVerify(pubKey);
		// 更新
		signature.update(decryptBASE64(data));
		// 验证
		return signature.verify(decryptBASE64(sign));
	}

	/**
	 * 公钥解密
	 * 
	 * @param data 待解密数据
	 * @param key 公钥
	 * @return byte[] 解密数据
	 * @throws Exception
	 */
	public static String decryptByPublicKey(String data, byte[] key) throws Exception {
		// 取得公钥
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		// 生成公钥
		PublicKey publicKey = keyFactory.generatePublic(x509KeySpec);
		// 对数据解密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		int key_len = ((RSAKey) publicKey).getModulus().bitLength() / 8;
		byte[] bytes = data.getBytes();
		byte[] bcd = ASCII_To_BCD(bytes, bytes.length);
		//如果密文长度大于模长则要分组解密
		String ming = "";
		byte[][] arrays = splitArray(bcd, key_len);
		for(byte[] arr : arrays){
			ming += new String(cipher.doFinal(arr));
		}
		return ming;
	}

	/**
	 * 私钥加密
	 * 
	 * @param data 待加密数据
	 * @param key 私钥
	 * @return byte[] 加密数据
	 * @throws Exception
	 */
	public static String encryptByPrivateKey(String data, byte[] key) throws Exception {
		// 取得私钥
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		// 生成私钥
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
		// 对数据加密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		// 模长
		int key_len = ((RSAKey) privateKey).getModulus().bitLength() / 8;
		// 加密数据长度 <= 模长-11
		String[] datas = splitString(data, key_len - 11);
		String mi = "";
		//如果明文长度大于模长-11则要分组加密
		for (String s : datas) {
			mi += bcd2Str(cipher.doFinal(s.getBytes()));
		}
		return mi;
	}

	/**
	 * 取得私钥
	 * 
	 * @param keyMap
	 * @return
	 * @throws Exception
	 */
	public static byte[] getPrivateKey(Map<String, Object> keyMap) throws Exception {
		Key key = (Key) keyMap.get(PRIVATE_KEY);
		return key.getEncoded();
	}
	
	/**
	 * 取得公钥
	 * 
	 * @param keyMap
	 * @return
	 * @throws Exception
	 */
	public static String getPublicKey(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PUBLIC_KEY); 
        return encryptBASE64(key.getEncoded());
	}
	
	
    public static String encryptBASE64(byte[] key) throws Exception {               
        return (new BASE64Encoder()).encodeBuffer(key);               
    }    
    
    public static byte[] decryptBASE64(String key) throws Exception {               
        return (new BASE64Decoder()).decodeBuffer(key);               
    }         

	/**
	 * 初始化密钥
	 * 
	 * @return Map 密钥对儿 Map
	 * @throws Exception
	 */
	public static Map<String, Object> initKey() throws Exception {
		// 实例化密钥对儿生成器
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		// 初始化密钥对儿生成器
		keyPairGen.initialize(KEY_SIZE);
		// 生成密钥对儿
		KeyPair keyPair = keyPairGen.generateKeyPair();
		// 公钥
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		// 私钥
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
		// 封装密钥
		Map<String, Object> keyMap = new HashMap<String, Object>(2);
		keyMap.put(PUBLIC_KEY, publicKey);
		keyMap.put(PRIVATE_KEY, privateKey);
		return keyMap;
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	public static Map<String,String> getSign(String ming) throws Exception {
		Map<String,String> maps = Maps.newHashMap();
		Map<String, Object> map=initKey();
		//获取公钥提交给服务器
		String pubKey= RSACoder.getPublicKey(map);
		//对明文加密生成密文
		String mi=encryptByPrivateKey(ming, getPrivateKey(map));
		//对密文数字签名
		String sign=RSACoder.sign(mi, getPrivateKey(map));
		maps.put("mi", mi);
		maps.put("pubKey", pubKey);
		maps.put("sign", sign);
		return maps;
	}
	
	/**
	 * ASCII码转BCD码
	 * 
	 */
	public static byte[] ASCII_To_BCD(byte[] ascii, int asc_len) {
		byte[] bcd = new byte[asc_len / 2];
		int j = 0;
		for (int i = 0; i < (asc_len + 1) / 2; i++) {
			bcd[i] = asc_to_bcd(ascii[j++]);
			bcd[i] = (byte) (((j >= asc_len) ? 0x00 : asc_to_bcd(ascii[j++])) + (bcd[i] << 4));
		}
		return bcd;
	}
	public static byte asc_to_bcd(byte asc) {
		byte bcd;

		if ((asc >= '0') && (asc <= '9'))
			bcd = (byte) (asc - '0');
		else if ((asc >= 'A') && (asc <= 'F'))
			bcd = (byte) (asc - 'A' + 10);
		else if ((asc >= 'a') && (asc <= 'f'))
			bcd = (byte) (asc - 'a' + 10);
		else
			bcd = (byte) (asc - 48);
		return bcd;
	}
	
	/**
	 * BCD转字符串
	 */
	public static String bcd2Str(byte[] bytes) {
		char temp[] = new char[bytes.length * 2], val;

		for (int i = 0; i < bytes.length; i++) {
			val = (char) (((bytes[i] & 0xf0) >> 4) & 0x0f);
			temp[i * 2] = (char) (val > 9 ? val + 'A' - 10 : val + '0');

			val = (char) (bytes[i] & 0x0f);
			temp[i * 2 + 1] = (char) (val > 9 ? val + 'A' - 10 : val + '0');
		}
		return new String(temp);
	}
	
	/**
	 * 拆分字符串
	 */
	public static String[] splitString(String string, int len) {
		int x = string.length() / len;
		int y = string.length() % len;
		int z = 0;
		if (y != 0) {
			z = 1;
		}
		String[] strings = new String[x + z];
		String str = "";
		for (int i=0; i<x+z; i++) {
			if (i==x+z-1 && y!=0) {
				str = string.substring(i*len, i*len+y);
			}else{
				str = string.substring(i*len, i*len+len);
			}
			strings[i] = str;
		}
		return strings;
	}
	/**
	 *拆分数组 
	 */
	public static byte[][] splitArray(byte[] data,int len){
		int x = data.length / len;
		int y = data.length % len;
		int z = 0;
		if(y!=0){
			z = 1;
		}
		byte[][] arrays = new byte[x+z][];
		byte[] arr;
		for(int i=0; i<x+z; i++){
			arr = new byte[len];
			if(i==x+z-1 && y!=0){
				System.arraycopy(data, i*len, arr, 0, y);
			}else{
				System.arraycopy(data, i*len, arr, 0, len);
			}
			arrays[i] = arr;
		}
		return arrays;
	}
}
