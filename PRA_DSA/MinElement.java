package org.example;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i< arr.length;i++){
            if(arr[i]<min){
                min= arr[i];

            }
        }
        System.out.println(min);
    }
}
