package com.bridgelabzs.arrays;

//Java Program to print the elements of an array present on an odd position
public class OddPosition {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 25, 1, 458, 3, 64, 97, 5 };
        System.out.print("Elements of given array present on odd position :");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }

    }
}
