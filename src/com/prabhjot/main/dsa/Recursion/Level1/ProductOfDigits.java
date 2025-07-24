package com.prabhjot.main.dsa.Recursion.Level1;

import java.util.*;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 55;
        System.out.println(product(num));
    }

    private static int product(int num) {
        if(num%10  == num){
            return num;
        }

        int digit = num%10;
        return digit * product(num/10);
    }
}
