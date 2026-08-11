package com.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class LearingArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int arr[] = new int[7];

        list.add(0, 200);
        list.add(1, 29);
        list.add(2, 27);
        list.add(3, 2);
        list.add(4, 28);
        list.add(5, 25);
        list.add(6, 22);

        System.out.println(list);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}