package com.stackroute.pe1;

import java.util.Scanner;

public class Iteration {
    public int[] iteration(int n){
        int size=0;
        int index=0;
        for(int i=1;i<=n;i++)
        {
            size+=i;
        }
        int[] arr = new int[size];
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
}