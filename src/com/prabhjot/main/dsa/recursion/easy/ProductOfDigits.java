package com.prabhjot.main.dsa.recursion.easy;

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
