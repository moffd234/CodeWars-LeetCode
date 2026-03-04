package org.example;

import java.util.ArrayList;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        // your code goes here
        return null;
    }

    public static void appendTime(ArrayList<String> timeList, int timeVal, String timeType){
        if(timeVal == 0){
            return;
        }

        timeList.add(timeVal + " " + timeType + (timeVal > 1 ? "s" : ""));
    }
}