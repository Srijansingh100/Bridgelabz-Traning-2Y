package org.example;

import java.util.Scanner;

public class MultiplyOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(10+arr[i]+" ");
            }
            else{
                System.out.print(2*arr[i]+" ");
            }
        }
    }
}
