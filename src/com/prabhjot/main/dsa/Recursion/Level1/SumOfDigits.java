package com.prabhjot.main.dsa.Recursion.Level1;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123456;
        System.out.println(sum(num));
    }

    private static int sum(int num) {
        if (num <= 0) {
            return 0;
        }
        int digit = num % 10;
        return digit + sum(num / 10);
    }
}
