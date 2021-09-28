package com.una;

public class Ejercicio4 {

    public static String dec2Bin(long n) {
        if (n == 0) {
            return "0";
        }
        return Long.valueOf((n % 2 + 10 * Long.parseLong(dec2Bin(n / 2)))).toString();
    }

    public static long bin2Dec(String b) {
        Integer len = b.length();
        if (len == 0) {
            return 0;
        }
        return Long.parseLong(b.substring(0, 1)) * (long) Math.pow(2, len - 1) + bin2Dec(b.substring(1));
    }
}
