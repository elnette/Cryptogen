package cryogen;

import java.io.File;

/**
 * @author Zander Labuschagne
 * E-Mail: ZANDER.LABUSCHAGNE@PROTONMAIL.CH
 * This class contains methods for the encryption and decryption of messages and files
 * Additional cryptosystems will be added
 * Copyright (C) 2017  Zander Labuschagne and Elnette Moller
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation
 */
public class Cryptography
{


    /**********************------------------------Vigenère Cipher------------------------**********************/


    /**
     * This class contains the necessary  algorithms for the Vigenère cipher
     */
    public static class VigenereCipher
    {
        /***********------------Text Cryptography------------***********/

        /**
         *
         * @param plainText
         * @param key
         * @return
         */
        public static char[] encrypt(char[] plainText, char[] key)
        {
            return null;
        }

        /**
         *
         * @param cipherText
         * @param key
         * @return    -fx-border-color: rgb(15, 15, 15);
         */
        public static char[] decrypt(char[] cipherText, char[] key)
        {
            return null;
        }

        /***********------------File Cryptography------------***********/

        /**
         *
         * @param plainData
         * @param key
         * @return
         */
        public static byte[] encrypt(byte[] plainData, char[] key)
        {
            byte[] cipherData = new byte[plainData.length];

            for(int iii = 0; iii < plainData.length; iii++)
                cipherData[iii] = (byte)((int)plainData[iii] + (int)key[iii % key.length]);

            return cipherData;
        }

        /**
         *
         * @param cipherData
         * @param key
         * @return
         */
        public static byte[] decrypt(byte[] cipherData, char[] key)
        {
            byte[] plainData = new byte[cipherData.length];

            for(int iv = 0; iv < cipherData.length; iv++)
            {
                plainData[iv] = (byte)((int)cipherData[iv] - (int)key[iv % key.length]);
            }

            return plainData;
        }
    }


    /**********************------------------------Vernam Cipher------------------------**********************/


    /**
     * This class contains the necessary algorithms for the Vernam cipher to encrypt messages and files
     */
    public static class VernamCipher
    {

        /***********------------Text Cryptography------------***********/

        public static char[] encrypt(char[] plainText, char[] key)
        {
            return null;
        }

        public static char[] decrypt(char[] cipherText, char[] key)
        {
            return null;
        }

        /***********------------File Cryptography------------***********/

        public static File encrypt(File plainFile, char[] key)
        {
            return null;
        }

        public static File decrypt(File cipherFile, char[] key)
        {
            return null;
        }
    }


    /******************--------------------Columnar Transposition Cipher--------------------******************/


    /**
     * This class contains the necessary algorithms for the Columnar Transposition cipher to encrypt messages and files
     */
    public static class ColumnarTranspositionCipher
    {

        /***********------------Text Cryptography------------***********/

        public static char[] encrypt(char[] plainText)
        {
            return null;
        }

        public static char[] decrypt(char[] cipherText)
        {
            return null;
        }

        /***********------------File Cryptography------------***********/

        public static File encrypt(File plainFile, char[] key)
        {
            return null;
        }

        public static File decrypt(File cipherFile, char[] key)
        {
            return null;
        }
    }


    /**********************------------------------Elephant Cipher------------------------**********************/


    /**
     * This class contains the necessary algorithms for the Elephant cipher to encrypt messages and files
     * Cipher derived by Zander Labuschagne & Elnette Moller
     */
    public static class ElephantCipher
    {

        /***********------------Text Cryptography------------***********/

        public static char[] encrypt(char[] plainText, char[] key)
        {
            return null;
        }

        public static char[] decrypt(char[] cipherText, char[] key)
        {
            return null;
        }

        /***********------------File Cryptography------------***********/

        public static File encrypt(File plainFile, char[] key)
        {
            return null;
        }

        public static File decrypt(File cipherFile, char[] key)
        {
            return null;
        }
    }


    /******************--------------------%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%--------------------******************/
}
