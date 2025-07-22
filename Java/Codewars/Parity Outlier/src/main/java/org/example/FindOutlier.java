package org.example;

public class FindOutlier {
    public static int find(int[] integers) {
        if(outlierIsOdd(integers)){
            for(int i : integers){
                if(isOdd(i)){
                    return i;
                }
            }
        }
        else{
            for(int i : integers){
                if(!isOdd(i)){
                    return i;
                }
            }
        }

        return 0;
    }

    public static boolean outlierIsOdd(int[] integers){
        int odd = 0;
        for(int i = 0; i < 3; i++){
            if(isOdd(integers[i])){
                odd++;
            }
        }
        return odd < 2;
    }

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

}