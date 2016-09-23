package com.customized.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

/**
 * 
 * @author gu 密码加密方法,加密方式 MD5 ， 目前只支持MD5方式 调用 MD5Utils.encode("密码","用户cguid");
 *
 */
public class MD5Utils {
	/**
	 * 
	 * @param paramString
	 *            用户密码
	 * @param paramObject
	 *            用户Cguid
	 * @return 加密后的结果 加密方法
	 * 
	 */
	public static String encode(String paramString, Object paramObject) {
		String str = paramString + "{" + paramObject.toString() + "}";
		MessageDigest localMessageDigest = md5();
		byte[] arrayOfByte1 = localMessageDigest.digest(str.getBytes());
		byte[] arrayOfByte2 = localMessageDigest.digest(arrayOfByte1);
		return new String(Hex.encodeHex(arrayOfByte2));
	}
	/**
	 * 
	 * @return 返回 MessageDigest 实体
	 * @throws IllegalArgumentException
	 */
	private final static MessageDigest md5() throws IllegalArgumentException {
		try {
			return MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
		}
		throw new IllegalArgumentException("No such algorithm [ MD5 ]");
	}

}
