package com.prabhjot.main.dsa.sorting.sorting_2.merge_sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,8,4,6,8,1,5,6,8,9};
        mergeSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if (s == e) return;

        int m = s + (e - s) / 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        merge(arr, s, m, e);
    }

    public static void merge(int[] arr, int s, int m, int e) {
        int i = s;
        int j = m + 1;
        int k = 0;

        int[] mix = new int[e - s + 1];

        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i <= m) mix[k++] = arr[i++];
        while (j <= e) mix[k++] = arr[j++];

        for (int l = s; l <= e; l++) {
            arr[l] = mix[l - s];
        }
    }
}
