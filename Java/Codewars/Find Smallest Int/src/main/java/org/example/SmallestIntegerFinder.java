package org.example;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for(int i: args){
            min = Math.min(min, i);
        }
        return min;
    }
}