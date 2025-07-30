package com.prabhjot.main.dsa.recursion.merge_sort.in_place_merge_sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};


        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if (start >= end) return; // base case.....

        int mid = start + (end - start) / 2; // dividing the array......

        mergeSort(arr, start, mid); //.....left halve.
        mergeSort(arr, mid + 1, end); // .....right halve.

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[end - start + 1];

        // merge arr.........
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // check for remaining elements.
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= end) temp[k++] = arr[j++];

        //put the values of temp into the original arr.
        for (int l = start; l <= end; l++) {
            arr[l] = temp[l - start]; // so that (l - start) can be 0, 1 , 2, 3, 4 ....
        }
    }
}
