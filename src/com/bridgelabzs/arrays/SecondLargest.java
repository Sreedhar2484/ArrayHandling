package com.bridgelabzs.arrays;

// Find 2nd Largest Number in an Array
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 11, 5, 56, 72, 3, 6, 41 };
        // invoking sort() method of the Arrays class
        Arrays.sort(arr);
        System.out.println("Second Largest Number in an Array :" + arr[arr.length - 2]);

    }
}