package com.prabhjot.main.dsa.recursion.introduction;

public class Introduction {
    public static void main(String[] args) {

//        for(int i = 0; i <= 15; i++){
//            System.out.print(printFibo(i) + " ");
//        }

        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        System.out.println("Element found at: "+binary(arr,target,0,arr.length - 1));
    }

    private static int binary(int[] arr, int target, int start, int end) {

        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        } else if(arr[mid] > target){
            end = mid - 1;
            return binary(arr,target, start, end);
        } else {
            start = mid + 1;
            return binary(arr,target,start,end);
        }
    }

    private static int printFibo(int n) {

        if(n == 0 || n == 1){
            return n;
        }

        return printFibo(n-1) + printFibo(n-2);
    }
}
