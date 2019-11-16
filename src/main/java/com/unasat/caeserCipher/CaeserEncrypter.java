package com.unasat.caeserCipher;

/**
 * Created by Jonathan on 5/23/2018.
 */
public interface CaeserEncrypter {

    public String encrypt(String message, int key);
    public String encryptSimple(String message, int key);
}
