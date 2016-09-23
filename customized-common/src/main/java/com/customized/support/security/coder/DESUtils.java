package com.customized.support.security.coder;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

//税号加密的类
public class DESUtils {

	private byte[] KEYArray = new byte[] { (byte) 38, (byte) 93, (byte) 51,
			(byte) 41, (byte) 100, (byte) 25, (byte) 27, (byte) 56 };
	private byte[] IVArray = new byte[] { (byte) 69, (byte) 84, (byte) 107,
			(byte) 42, (byte) 28, (byte) 14, (byte) 27, (byte) 78 };

	private AlgorithmParameterSpec iv = null;// 加密算法的参数接口，IvParameterSpec是它的一个实现
	private Key key = null;

	public DESUtils() throws Exception {
		DESKeySpec keySpec = new DESKeySpec(KEYArray);// 设置密钥参数
		iv = new IvParameterSpec(IVArray);// 设置向量
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");// 获得密钥工厂
		key = keyFactory.generateSecret(keySpec);// 得到密钥对象
	}

	public  String encode(String data) throws Exception {
		Cipher enCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		enCipher.init(Cipher.ENCRYPT_MODE, key, iv);// 设置工作模式为加密模式，给出密钥和向量
		byte[] pasByte = enCipher.doFinal(data.getBytes("utf-8"));
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(pasByte);
	}

	public  String decode(String data) throws Exception {
		Cipher deCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		deCipher.init(Cipher.DECRYPT_MODE, key, iv);
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] pasByte = deCipher.doFinal(decoder.decodeBuffer(data));
		return new String(pasByte, "UTF-8");
	}
}
