package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    public static int[][] twosDifference(int[] array) {
        Arrays.sort(array);
        int[][] subArrays = findSubArrays(array);
        ArrayList<int[]> output = new ArrayList<>();

        for (int[] subArray : subArrays) {
            if (Math.abs(subArray[0] - subArray[1]) == 2) {
                output.add(subArray);
            }
        }

        System.out.println(output);
        int[][] result =  convertTo2DArray(output);
        System.out.println(Arrays.deepToString(result));
        return result;
    }


    public static int[][] findSubArrays(int[] input) {
        int n = input.length;
        if (n < 2) {
            return new int[][]{};
        }

        int[][] subArrays = new int[(n * (n - 1)) / 2][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                subArrays[index][0] = input[i];
                subArrays[index][1] = input[j];
                index++;
            }
        }

        return subArrays;
    }


    public static int[][] convertTo2DArray(ArrayList<int[]> input) {
        int[][] output = new int[input.size()][2];
        for (int i = 0; i < input.size(); i++) {
            output[i] = input.get(i);
        }
        return output;
    }
}