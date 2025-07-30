package com.prabhjot.main.striver_sheet.basics.maths.reverse_a_number;

import java.util.*;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {
        int result = 0;

        while(n != 0){
            int l = n % 10;
            result += l;
            if(l != n) result *= 10;

            n /= 10;
        }

        return result;
    }
}
