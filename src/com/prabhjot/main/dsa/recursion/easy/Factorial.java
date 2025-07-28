package com.prabhjot.main.dsa.recursion.easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    private static int factorial(int n) {
        if(n == 1 )  {
            return 1;
        }
        return n * factorial(n-1);
    }
}
