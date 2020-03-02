package com.testlander.thirtydaysofcode.day7;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {3,12,32,35};

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
