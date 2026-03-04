package org.example;

import java.util.ArrayList;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if(seconds == 0){
            return "now";
        }

        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_DAY = 86400;
        final int SECONDS_IN_YEARS = 31536000;

        int years = seconds / SECONDS_IN_YEARS;
        int remainder = seconds % SECONDS_IN_YEARS;

        int days = remainder / SECONDS_IN_DAY;
        remainder = remainder % SECONDS_IN_DAY;

        int hours = remainder / SECONDS_IN_HOUR;
        remainder = seconds % SECONDS_IN_HOUR;

        int minutes = remainder / SECONDS_IN_MINUTE;
        remainder = remainder % SECONDS_IN_MINUTE;

        return formatOutput(years, days, hours, minutes, remainder);
    }

    public static String formatOutput(int years, int days, int hours, int minutes, int seconds){
        ArrayList<String> timeList = new ArrayList<>();

        appendTime(timeList, years, "year");
        appendTime(timeList, days, "day");
        appendTime(timeList, hours, "hour");
        appendTime(timeList, minutes, "minute");
        appendTime(timeList, seconds, "second");

        if (timeList.size() == 1) return timeList.get(0);
        if (timeList.size() == 2) return timeList.get(0) + " and " + timeList.get(1);

        return String.join(", ", timeList.subList(0, timeList.size() - 1))
                + " and "
                + timeList.get(timeList.size() - 1);
    }

    public static void appendTime(ArrayList<String> timeList, int timeVal, String timeType){
        if(timeVal == 0){
            return;
        }

        timeList.add(timeVal + " " + timeType + (timeVal > 1 ? "s" : ""));
    }
}