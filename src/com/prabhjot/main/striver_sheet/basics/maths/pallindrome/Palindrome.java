package com.prabhjot.main.striver_sheet.basics.maths.pallindrome;

public class Palindrome {
    public static void main(String[] args) {
        int n = -121;
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        return n == rev(n);
    }

    private static int rev(int n) {
        int r = 0;
        while (n != 0) {
            int l = n % 10;

            if(r > Integer.MAX_VALUE / 10 || r == Integer.MAX_VALUE / 10 && l > 7) return -1;
            if(r < Integer.MIN_VALUE / 10 || r == Integer.MIN_VALUE / 10 && l < -8) return -1;

            r *= 10;
            r += l;
            n /= 10;
        }
        return r;
    }
}
