package com.prabhjot.main.dsa.recursion.bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, -4, -3, -2, -1, 0};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int counter) {

        if (counter < 1) {
            return;
        }

        // it if is working like a loop which runs for i < counter.
        if (i < counter) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
            sort(arr, i + 1, counter);
        } else {
            sort(arr, 0, counter - 1);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
