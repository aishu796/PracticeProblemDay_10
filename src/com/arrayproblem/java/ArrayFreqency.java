package com.arrayproblem.java;

import java.util.Arrays;

public class ArrayFreqency {
    public static void countfreq(int arr[],int n)
    {
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);

        for(int i=0;i<n;i++)
        {
            if(visited[i]==true)
                continue;
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if (arr[i]==arr[j])
                {
                    visited[j]=true;
                    count ++;

                }
            }
            System.out.println(arr[i]   +   "occures"    +   count    +   "times");

        }

    }
    public static void main(String[] args) {
int arr[]=new int []{10,20,30,10,10,20,50,30};
int n=arr.length;
countfreq(arr,n);
    }
}
