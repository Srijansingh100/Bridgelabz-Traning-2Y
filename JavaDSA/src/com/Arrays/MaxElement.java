package com.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int arr[]={1,2,3,4,5,6,7};
        for(int i = 0 ;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
