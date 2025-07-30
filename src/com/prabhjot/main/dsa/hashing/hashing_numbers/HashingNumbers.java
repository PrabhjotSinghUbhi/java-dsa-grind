package com.prabhjot.main.dsa.hashing.hashing_numbers;

public class HashingNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 3, 4, 5, 6, 7, 4, 7};
        int max = findMax(arr);

        int[] hash = new int[max + 1];

        for (int i = 0; i < hash.length; i++) hash[arr[i]] += 1;

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d is appearing %d times \n",arr[i],hash[arr[i]]);
        }

        System.out.printf("%,d",10000000);

    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) max = Integer.max(max, arr[i]);
        return max;
    }

}
