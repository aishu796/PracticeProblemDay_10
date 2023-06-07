package com.arrayproblem.java;

public class ReverseArray {
    public static void main(String[] args) {
        int [] n={1,2,3,4,5};
        System.out.println("original array ");
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]+ " ");
        }
        System.out.println("Reverse order ");
        for(int i=n.length-1;i>=0;i--)
        {
            System.out.println(n[i]+" ");
        }
    }
}
