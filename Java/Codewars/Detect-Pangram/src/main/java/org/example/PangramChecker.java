package org.example;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence){
        Set<Character> uniqueChars = getUniqueChars(sentence);
        return uniqueChars.size() == 26;
    }

    public Set<Character> getUniqueChars(String sentence){
        Set<Character> uniqueChars = new HashSet<>();
        for(char c : sentence.toCharArray()){
            if(Character.isLetter(c)){
                uniqueChars.add(Character.toLowerCase(c));
            }
        }
        return uniqueChars;
    }
}