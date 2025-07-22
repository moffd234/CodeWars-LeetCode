package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            numIndices.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(numIndices.containsKey(target - nums[i]) && numIndices.get(target - nums[i]) != i){
                return new int[]{i, numIndices.get(target - nums[i])};
            }
        }
        return null;
    }
}