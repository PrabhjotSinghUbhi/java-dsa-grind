package com.prabhjot.main.dsa.recursion.merge_sort.copy_of_array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {

        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] result = new int[leftArr.length + rightArr.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                result[k++] = leftArr[i++];
            } else {
                result[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length) {
            result[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            result[k++] = rightArr[j++];
        }

        return result;
    }

}
