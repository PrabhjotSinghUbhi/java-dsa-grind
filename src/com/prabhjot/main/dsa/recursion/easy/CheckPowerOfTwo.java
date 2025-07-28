package com.prabhjot.main.dsa.recursion.easy;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int num = 256;
        System.out.println(check(num));
    }

    private static boolean check(int num) {
        if (num == 1) {
            return true;
        }

        if (num < 1 || (num & 1) == 1) {
            return false;
        }

        return check(num / 2);
    }
}
