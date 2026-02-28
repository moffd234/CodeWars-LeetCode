package org.example;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        return convertIpToDecimalLong(end) - convertIpToDecimalLong(start);
    }

    private static long convertIpToDecimalLong(String ip){
        String[] octets = ip.split("\\.");
        long decimalIp = 0;

        for(String octet : octets){
            decimalIp = decimalIp * 256 + Long.parseLong(octet);
        }

        return decimalIp;
    }
}
