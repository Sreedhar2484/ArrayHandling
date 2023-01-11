package com.bridgelabzs.arrays;

//3) Java Program to print the largest element in an array4) Java Program to print the smallest element in an array

public class LargestElement {
    public static void main (String[] args){
          //Initialize array  
        int[] Array = new int [] {1,3,5,12,31,2,1,45,4};
         //Initialize max with first element of array.  
        int max = Array[0];
        
        for(int i=0;i<Array.length; i++){
            //Compare elements of array with max  
            if(Array[i]>max){
                max=Array[i];
                
            }    
        }
     System.out.println("Largest Element in Array is : "+ max);
    }
}