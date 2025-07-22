package org.example;

import java.util.ArrayList;

public class Solution {
    /*
        This could be done easily in one method with about 5 lines of code.
        However, I wanted to break this up to adhere to single use
     */
    public int solution(int number) {
        ArrayList<Integer> multiples = getMultiples(number);
        return sumMultiples(multiples);
    }


    public ArrayList<Integer> getMultiples(int num) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for(int i = 3; i < num; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                multiples.add(i);
            }
        }
        return multiples;
    }

    public int sumMultiples(ArrayList<Integer> multiples) {
        int sum = 0;
        for(int i : multiples) {
            sum += i;
        }
        return sum;
    }
}