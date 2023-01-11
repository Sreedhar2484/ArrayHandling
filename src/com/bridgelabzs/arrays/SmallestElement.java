package com.bridgelabzs.arrays;

//4) Java Program to print the smallest element in an array

public class SmallestElement {
    public static void main(String[] args) {
        // Initialize array
        int[] Array = new int[] { 4, 3, 5, 12, 31, 21, 10, 45, 4 };
        // Initialize min with first element of array.
        int min = Array[0];

        for (int i = 0; i < Array.length; i++) {
            // Compare elements of array with max
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        System.out.println("Smallest Element in Array is : " + min);
    }
}