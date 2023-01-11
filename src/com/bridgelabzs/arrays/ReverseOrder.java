package com.bridgelabzs.arrays;
//Java Program to print the elements of an array in reverse order

public class ReverseOrder {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 11, 5, 56, 72, 3, 6, 4 };
        System.out.println("Array in reverse order: ");
        // Loop through the array in reverse order
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
