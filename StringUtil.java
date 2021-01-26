package com.project.util;

import android.util.Log;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class StringUtil {
	private final static String LOG_TAG = StringUtil.class.getSimpleName();

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////// Text/Number Related Function ////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 1) String paddingText(String(1), String(2), int) : {String(1)}의 문자열 길이가 length보다 작다면, 그 여백을 {String(2)}로 대체한다.
	 * 2) String hexToBinary(String) : Hex {String} 1문자 당 4bit의 2진수로 변환.
	 * 3) String ipToIPString(int) : {int}를 ipString으로 변환. (ex: 192.168.0.1)
	 * 4) byte[] longToBytes(long)
	 * 5) long bytesToLong(byte[])
	 * 6) byte[] intToBytes(int)
	 * 7) int bytesToInt(byte[])
	 * 8) byte[] hexStringToBytes(String)
	 * 9) String bytesToHexString(byte[])
	 * 10) long toUnsignedInt(int) : 4byte로 표현할 수 있는 최대 값 (0xFFFFFFFF, 42억)을 &연산
	 * */
	public static String paddingText(String str, String paddingStr, int length) {
		StringBuilder strBuilder = new StringBuilder(str);
		while(strBuilder.length() < length)
			strBuilder.insert(0, paddingStr);
		str = strBuilder.toString();

		return str;
	}

	public static String hexToBinary(String hexString) {
		// hex : FFEA7ECDEFFEEAFFFEA7ECDEFFEEAF
		// return 1111 1111 1110 1010 0111 1110 1100 1101 1110 1111 1111 1110 1110 1010 1111
		//        1111 1111 1110 1010 0111 1110 1100 1101 1110 1111 1111 1110 1110 1010 1111 : 15x8 = 120

		//return new BigInteger(hexString, 16).toString(2);
		//000000[6] : 0[1]
		//111111[6] : 100010001000100010001[21]

		String result = "";
		for (int i=0;i<hexString.length();i++) {
			String temp = Integer.toString(Integer.parseInt(hexString.charAt(i) + "", 16),2);

			for (int j=0;j<4-temp.length();j++) {
				result += "0";
			}
			result += temp;
		}

		return result;
	}

	static public String ipToIPString(int nIP)
	{
		String sIP = "";

		if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
			nIP = Integer.reverseBytes(nIP);
		}

		byte [] byteIP = BigInteger.valueOf(nIP).toByteArray();
		try {
			sIP = InetAddress.getByAddress(byteIP).getHostAddress();
			Log.e(LOG_TAG, "### IP = " + sIP + " ###");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		return sIP;
	}

	public static byte[] longToBytes(long x) {
		ByteBuffer buffer = ByteBuffer.allocate(8);
		buffer.putLong(x);
		return buffer.array();
	}

	public static long bytesToLong(byte[] bytes) {
		ByteBuffer buffer = ByteBuffer.allocate(8);
		buffer.put(bytes);
		buffer.flip();//need flip
		return buffer.getLong();
	}

	public static byte[] intToBytes(int x) {
		ByteBuffer buffer = ByteBuffer.allocate(4);
		buffer.putInt(x);

		return buffer.array();
	}

	public static int bytesToInt(byte[] bytes) {
		ByteBuffer buffer = ByteBuffer.allocate(4);
		buffer.put(bytes);
		buffer.flip();//need flip
		return buffer.getInt();
	}

	public static byte[] hexStringToBytes(String hex){
		// Adding one byte to get the right conversion
		// values starting with "0" can be converted
		byte[] bArray = new BigInteger("10" + hex,16).toByteArray();

		// Copy all the REAL bytes, not the "first"
		byte[] ret = new byte[bArray.length - 1];
		for (int i = 0; i < ret.length ; i++)
			ret[i] = bArray[i+1];
		return ret;
	}

	public static String bytesToHexString(byte[] bytes) {
		StringBuilder result = new StringBuilder();
		for (byte aByte : bytes) {
			result.append(String.format("%02x", aByte & 0xFF));
		}

		return result.toString();
	}

	public static String bytesToHexString(byte[] bytes, int length) {
		StringBuilder result = new StringBuilder();
		for (byte aByte : bytes) {
			if (length-- == 0) break;

			result.append(String.format("%02x", aByte & 0xFF));
		}

		return result.toString();
	}

	public static long toUnsignedInt(int value) {
		return value & 0xFFFFFFFFL;
	}
}
