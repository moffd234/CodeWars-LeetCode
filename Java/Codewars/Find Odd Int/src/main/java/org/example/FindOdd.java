package org.example;


import java.util.HashMap;

public class FindOdd {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> map = getMap(a);
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static HashMap<Integer, Integer> getMap(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}