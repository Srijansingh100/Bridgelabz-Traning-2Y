package org.example;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int arr[]=new int[n];
        int sum = 0;
        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i< arr.length;i++){
            sum=sum+arr[i];
            System.out.print(arr[i]+" ");

        }
        System.out.print(sum);
    }
}
