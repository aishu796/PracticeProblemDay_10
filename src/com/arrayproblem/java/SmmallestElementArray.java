package com.arrayproblem.java;

public class SmmallestElementArray {
    public static void main(String[] args) {
        int []arr={20,50,87,90,96};
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
        {

            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smmallest Element in an array is"+min);

    }
}
