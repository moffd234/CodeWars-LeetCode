package org.example;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        return number == calculateNarcissisticSum(number);
    }

    public static int calculateNarcissisticSum(int n) {
        int total = 0;
        int len = String.valueOf(n).length();
        while (n > 0) {
            int number = n % 10;
            total += (int) Math.pow(number, len);
            n = n / 10;
        }
        return total;
    }
}