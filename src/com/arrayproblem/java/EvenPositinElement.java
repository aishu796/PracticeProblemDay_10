package com.arrayproblem.java;

public class EvenPositinElement
{
    public static void main(String[] args) {
        int [] n={10,20,30,40,50};
        for(int i=0;i<n.length;i=i+2)
        {
            System.out.println("Array Even position element is:"+n[i]);
        }

    }
}
