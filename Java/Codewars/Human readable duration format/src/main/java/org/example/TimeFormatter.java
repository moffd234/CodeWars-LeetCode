package org.example;

import java.util.ArrayList;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_HOUR = 3600;

        int hours = seconds / SECONDS_IN_HOUR;
        int remainder = seconds % SECONDS_IN_HOUR;

        int minutes = remainder / SECONDS_IN_MINUTE;
        remainder = remainder % SECONDS_IN_MINUTE;

        return formatOutput(hours, minutes, remainder);
    }

    public static String formatOutput(int hours, int minutes, int seconds){
        ArrayList<String> timeList = new ArrayList<>();

        appendTime(timeList, hours, "hour");
        appendTime(timeList, minutes, "minute");
        appendTime(timeList, seconds, "second");

        if(timeList.size() == 1){
            return timeList.get(0);
        }

        if(timeList.size() == 2){
            return timeList.get(0) + " and " + timeList.get(1);
        }

        if(timeList.size() == 3){
            return timeList.get(0) + ", " + timeList.get(1) + " and " + timeList.get(2);
        }

        return null;
    }

    public static void appendTime(ArrayList<String> timeList, int timeVal, String timeType){
        if(timeVal == 0){
            return;
        }

        timeList.add(timeVal + " " + timeType + (timeVal > 1 ? "s" : ""));
    }
}