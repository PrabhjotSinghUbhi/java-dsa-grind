package com.prabhjot.main.dsa.Recursion.Level1;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 182400;
        System.out.println(reverseNum(num));
    }

    private static int reverseNum(int num) {
        if (num % 10 == num) {
            return num;
        }

       int lastDigit = num % 10;

        return lastDigit + reverseNum(num / 10);
    }
}
