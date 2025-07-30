package com.prabhjot.main.striver_sheet.sorting_2.merger_sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // divide and merge.
        int[] arr = {5, 4, 3, 2, 6, 10, 13};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;

        int[] mix = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i <= mid) mix[k++] = arr[i++];
        while (j <= end) mix[k++] = arr[j++];

        for(int x = start; x <= end; x++) {
            arr[x] = mix[x - start];
        }
    }
}
