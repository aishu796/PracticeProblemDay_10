package com.arrayproblem.java;

public class ArrayDuplicateElement
{
    public static void main(String[] args) {
        int []n={1,2,3,2,2,2,1,1,9,2,8,8,7,7,9};
        System.out.println("Duplicate Elements in given array is:");
        for(int i=0;i<n.length;i++)
            for(int j=i+1;j<n.length;j++)
                if(n[i]==n[j])
                    System.out.print(n[j] + "  ");
    }
}
