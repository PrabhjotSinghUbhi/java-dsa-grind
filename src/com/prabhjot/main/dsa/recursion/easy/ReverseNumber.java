package com.prabhjot.main.dsa.recursion.easy;

public class ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
        int num = 1820;
        reverseNum(num);
        System.out.println(sum);
    }

    static void reverseNum(int num) {
        if (num <= 0) {
            return;
        }

        int lastDigit = num % 10;
        sum += lastDigit;
        if (num % 10 != num) {
            sum *= 10;
        }

        reverseNum(num / 10);
    }
}
