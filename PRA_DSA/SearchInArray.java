package org.example;

public class SearchInArray {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,9};
        int target=4;
        for(int i =0;i< arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element exist in array ");
            } else {
                System.out.println("Not in the array ");
            }
        }
    }
}
