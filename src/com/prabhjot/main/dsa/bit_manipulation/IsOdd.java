package com.prabhjot.main.dsa.bit_manipulation;

public class IsOdd {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num) {
        return ((num & 1) == 1);
    }
}
