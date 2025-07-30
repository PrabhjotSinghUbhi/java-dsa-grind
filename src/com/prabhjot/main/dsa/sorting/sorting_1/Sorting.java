package com.prabhjot.main.dsa.sorting.sorting_1;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {499,40,30,20,10,50,100,43,56,398};
//        int[] result = bubble(arr);
//        int[] result = selection(arr);
//        int[] result = insertion(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
       for(int i = 1; i < arr.length - 1; i++){
           for(int j = i+1; j > 0; j--){
               if(arr[j]< arr[j-1]){
                   swap(arr,j,j-1);
               } else {
                   break;
               }
           }
       }
    }

    private static int[] selection(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);

            swap(arr, last, maxIndex);
        }
        return arr;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int[] bubble(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}