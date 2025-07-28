package com.prabhjot.main.dsa.recursion.array_based;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 4, 6, 7, 43, 5, 4, 67, 37, 75, 4};
        int target = 4;
//        ArrayList<Integer> list = new ArrayList<>();
//        searchAll(arr, target, 0, list);
        ArrayList<Integer> result = searchAll2(arr, target, 0);
        System.out.println(result);
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

    private static ArrayList<Integer> searchAll2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (arr.length == index) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> funcCallsFromBelow = searchAll2(arr, target, index + 1);
        list.addAll(funcCallsFromBelow);

        return list;
    }
}