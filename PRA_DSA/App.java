package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        //Array input;
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        //Array output;
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
