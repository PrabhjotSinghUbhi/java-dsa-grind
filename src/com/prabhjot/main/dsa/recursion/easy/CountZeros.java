package com.prabhjot.main.dsa.recursion.easy;

public class CountZeros {
    static int count = 0;

    public static void main(String[] args) {
        int num = 1440;
        count(num);
        System.out.println(count);
    }

    private static void count(int num) {
        if (num == 0) {
            return;
        }
        int digit = num % 10;
        if (digit == 0) count++;

         count(num / 10);
    }
}
