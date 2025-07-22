package org.example;

import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = createHashMap(s);
        HashMap<Character, Integer> tMap = createHashMap(t);

        return sMap.equals(tMap);
    }

    public HashMap<Character, Integer> createHashMap(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        return map;
    }
}
