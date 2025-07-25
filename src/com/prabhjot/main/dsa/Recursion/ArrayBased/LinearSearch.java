package com.prabhjot.main.dsa.Recursion.ArrayBased;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 4, 6, 7, 43, 5,4, 67, 37, 75,4};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        searchAll(arr, target, 0, list);
        System.out.println(list);
    }

    private static int search(int[] arr, int target) {

        return helper(arr, target, 0);
    }

    private static int helper(int[] arr, int target, int index) {
        if (arr.length == index) {
            return -1;
        }
        return target == arr[index] ? index : helper(arr, target, index + 1);
    }

    private static void searchAll(int[] arr, int target, int index, List list) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        searchAll(arr, target, index + 1, list);
    }
}
