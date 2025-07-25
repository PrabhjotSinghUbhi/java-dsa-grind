package com.prabhjot.main.dsa.Recursion.ArrayBased;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(check(arr));
    }

    private static boolean check(int[] arr) {
        return sorted(arr, 0);
    }

    private static boolean sorted(int[] arr, int index) {

        if (arr[arr.length - 1] == arr[index]) { // if the pointer has reached to the end that means arr is sorted.
            return true;
        }

        return arr[index] <= arr[index + 1] && sorted(arr, index + 1);
    }
}
