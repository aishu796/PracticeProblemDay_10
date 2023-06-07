package com.arrayproblem.java;

public class LargeElementArray {
    public static void main(String[] args) {
        int []arr={20,50,89,87,56};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];

        }
        System.out.println("Largest Element in an array is :" +max);
    }
}
