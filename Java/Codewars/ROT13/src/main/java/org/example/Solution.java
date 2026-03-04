package org.example;

public class Solution {

    public static String rot13(String message) {
        return "";
    }


    public static char convertChar(char c) {
        if(c >= 'a' && c <= 'z'){
            return (char) ('a' + (c - 'a' + 13) % 26);
        }

        if(c >= 'A' && c <= 'Z'){
            return (char) ('A' + (c - 'A' + 13) % 26);
        }

        return c;
    }
}