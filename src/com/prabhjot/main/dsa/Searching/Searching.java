package com.prabhjot.main.dsa.Searching;

import java.util.*;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 43, 50, 56, 100, 398};
        int target = 43;
//        int foundAt = linear(arr,target);
        int foundAt = binary(arr,target);
        validate(foundAt);

    }

    public static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    private static void validate(int foundAt) {
        String result =  foundAt != -1 ? ("Found at: " + foundAt) : "Could not find the value.";
        System.out.println(result);
    }
}
