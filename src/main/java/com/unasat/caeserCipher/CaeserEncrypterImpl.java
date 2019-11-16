package com.unasat.caeserCipher;

/**
 * Created by Jonathan on 5/23/2018.
 */
public class CaeserEncrypterImpl implements CaeserEncrypter {

    public String encrypt(String message, int key) {
        String encryptedMessage = "";

        int len = message.length();
        // loop through every character of the message
        for (int x = 0; x< len; x++){
            // convert the String to char
            char c = (char) (message.charAt(x) + key);
            // Add shift to the character and if it falls off the end of the alphabet then subtract shift from the number of
            // letters in the alphabet (26)
            // If the shift does not make the character fall off the end of the alphabet, then add the shift to the character.
            if(c > 'z'){
                encryptedMessage += (char) (message.charAt(x) - (26 - key));
            }
                else if ((char)(message.charAt(x)) == ' ') {
                // detected a space, so dont shift the space
                encryptedMessage += (char) (message.charAt(x));
            }
            else{
                encryptedMessage += (char) (message.charAt(x) + key);
            }
        }
        System.out.println(encryptedMessage);
        // spaces becomes $, remove it first
        return encryptedMessage.replace("$", " ");
    }

    public String encryptSimple(String message, int key){

        char[] chars = message.toCharArray();
        StringBuilder encrypted = new StringBuilder();

        for (Character character : chars) {
            for (char i = 'a'; i < 'z' + 1; i++) {
            }
        }
        return encrypted.toString();
    }
}
