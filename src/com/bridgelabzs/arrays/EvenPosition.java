package com.bridgelabzs.arrays;

//Java Program to print the elements of an array present on an even position
public class EvenPosition {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 25, 1, 458, 3, 64, 97, 5 };
        System.out.print("Elements of given array present on even position :");
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }

    }
}
