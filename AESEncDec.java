/**
 * 1) byte[] encAES128(String, byte[]) : {String}을 이용하여 {byte[]}를 AES128로 암호화
 * 2) byte[] decAES128(String, byte[]) : {String}을 이용하여 {byte[]}를 AES128로 복호화
* */
public static Key getAESKey(String key) {
    Key keySpec;

    byte[] keyBytes = new byte[16];
    byte[] b = key.getBytes(UTF_8);

    int len = b.length;
    if (len > keyBytes.length) {
        len = keyBytes.length;
    }

    System.arraycopy(b, 0, keyBytes, 0, len);
    keySpec = new SecretKeySpec(keyBytes, "AES");

    return keySpec;
}

static public byte[] encAES128(String key, byte[] arr) throws Exception {
    HSLog.e("HSUtil/encAES128", "Key [" + key + "], encArr[" + bytesToHexString(arr) + "]");

    Key keySpec = getAESKey(key);
    IvParameterSpec iv = new IvParameterSpec("sethoseotelnetiv".getBytes());
    System.out.println("iv " + iv.getIV());
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);

    return cipher.doFinal(arr);
}

static public byte[] decAES128(String key, byte[] decArr) throws Exception {
    HSLog.e("HSUtil/decAES128", "Key [" + key + "], decArr[" + decArr.length + "]");

    Key keySpec = getAESKey(key);
    IvParameterSpec iv = new IvParameterSpec("sethoseotelnetiv".getBytes());
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(Cipher.DECRYPT_MODE, keySpec, iv);

    try {
        return cipher.doFinal(decArr);
    } catch (BadPaddingException | IllegalBlockSizeException e) {
        HSLog.e("AES Cipher Message", e.getMessage());
        e.printStackTrace();
    }

    return null;
}
