package com.prabhjot.main.dsa.recursion.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    static int maxIndex = 0;

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int counter) {

        if (counter <= 0) {
            return;
        }

        int lastIndex = counter - 1;

        // this is a loop.
        if (counter > i) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            sort(arr, i + 1, counter);
        } else {
            swap(arr, lastIndex, maxIndex);
            maxIndex = 0;
            sort(arr, 0, counter - 1);
        }

    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
