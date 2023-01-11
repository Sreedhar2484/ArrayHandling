package com.bridgelabzs.arrays;

//Java Program to print the duplicate elements of an array
public class Duplicates {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[] { 1, 2, 33, 4, 1, 7, 8, 8, 33, 2, 6, 4, 6 };

        System.out.println("Duplicate elements in given array: ");
        // Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);

            }
        }
    }
}