package com.prabhjot.main.dsa.recursion.easy;

public class Demo {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n){
        if(n == 0){
            return;
        }

        fun(n-1);
        System.out.print(n + " ");
    }
}
