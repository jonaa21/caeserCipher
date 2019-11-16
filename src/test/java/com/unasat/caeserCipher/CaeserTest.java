package com.unasat.caeserCipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jonathan on 5/23/2018.
 */
public class CaeserTest {

    private CaeserEncrypter encrypter;

    @Before
    public void setUp() throws Exception {
        encrypter = new CaeserEncrypterImpl();
    }

    @Test
    public void shouldEncryptCorrectly() {

        //Given
        String message = "caeser decipher rules";

        //When
        String encryptedMessage = encrypter.encrypt(message, 4);

        //Then
        assertEquals("geiwiv higmtliv vypiw", encryptedMessage);
    }

    @Test
    public void shouldEncryptSimple(){
        //Given
        String message = "caeser decipher rules";

        //When
        String encryptedMessage = encrypter.encryptSimple(message, 4);

        assertEquals("geiwiv higmtliv vypiw", encryptedMessage);
    }
}
