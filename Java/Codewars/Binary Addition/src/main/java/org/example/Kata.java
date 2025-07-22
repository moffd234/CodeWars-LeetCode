package org.example;

public class Kata{

    public static String binaryAddition(int a, int b){
        StringBuilder output = new StringBuilder();
        int sum = a + b;
        while(sum > 0){
            output.insert(0,sum % 2);
            sum /= 2;
        }
        return output.toString();
    }
}