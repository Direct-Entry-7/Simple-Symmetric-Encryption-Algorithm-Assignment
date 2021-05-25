package lk.ijse.app.util;

public class Cryptography {
    public static String key;
    public static String encrypt(String plainText, String key) {
        String reversedText = "";
        String cipherText = "";

        //Change plain text by adding each char + 5 and assign to variable called firstText
        String firstText = "";
        for (int i = 0; i < plainText.length(); i++) {
            int code = plainText.charAt(i);
            code += 5;
            char newChar = (char) code;
            firstText += newChar;
        }

        //Reverse Plain Text
        for (int i = plainText.length() - 1; i >= 0; i--) {
            reversedText += plainText.charAt(i);
        }

        //Change reversed text by adding each char + 10 and assign to variable called secondText
        String secondText = "";
        for (int i = 0; i < reversedText.length(); i++) {
            int code = plainText.charAt(i);
            code += 10;
            char newChar = (char) code;
            //Add to front
            secondText += newChar ;
        }

        String concatenatedText = secondText + key + firstText;

        //Generate keyNumber using entered key
        int keyCode = 0;
        for (int i = 0; i < key.length()-1; i++) {
            keyCode += key.codePointAt(i);
        }

        //Add generated key number to concatenated text
        for (int i = 0; i < concatenatedText.length(); i++) {
            int code = concatenatedText.charAt(i);
            code += keyCode;
            char newChar = (char) code;
            cipherText += newChar;
        }

        return cipherText;
    }
    public static String decrypt(String cipherText, String key) {
        return "";
    }
}
