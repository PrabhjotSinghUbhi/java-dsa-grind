package com.prabhjot.main.dsa.recursion.easy;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12271;
        System.out.println(checkPalindrome(num));
    }

    private static boolean checkPalindrome(int num) {
        return num == rev(num);
    }

    private static int rev(int num) {
        if (num % 10 == num) {
            return num;
        }

        int noOfDigits = num == 0 ? 1 : (int) Math.log10(Math.abs(num)) + 1;
        int digit = num % 10;
        int placeholder = (int) Math.pow(10, noOfDigits - 1);

        return digit * placeholder + rev(num / 10);
    }
}
