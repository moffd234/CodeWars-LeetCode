package org.example;

public class Kata {

    public static String high(String s) {
        int maxScore = Integer.MIN_VALUE;
        String maxWord = "";

        for(String str : s.split(" ")) {
            int score = calcWordScore(str);
            maxScore = Math.max(score, maxScore);
        }

        return maxWord;
    }

    public static int calcLetterScore(char letter) {
        return letter - 'a' + 1;
    }

    public static int calcWordScore(String str) {
        int sum = 0;
        for(Character c: str.toCharArray()) {
            sum += calcLetterScore(c);
        }
        return sum;
    }

}