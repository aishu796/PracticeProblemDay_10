package com.arrayproblem.java;

public class OddPositionElement
{
    public static void main(String[] args) {
        int [] n={10,20,30,40,50};
        for(int i=1;i<n.length;i=i+2)
        {
            System.out.println("Odd position element is"+n[i]);
        }
    }
}
