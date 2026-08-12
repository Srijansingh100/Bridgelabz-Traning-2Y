package org.example;

public class SecMaxEle {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,78,89};
        int max= Integer.MIN_VALUE;
        int SecMax=Integer.MIN_VALUE;
        for(int  i=0;i<arr.length;i++){
            if(arr[i]>max){
                arr[i]=max;
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>SecMax && arr[i]!=max){
                arr[i]=SecMax;

            }
            System.out.println(SecMax);
        }

    }

}
