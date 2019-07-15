package com.stackroute.pe1;

import java.util.Arrays;

public class Sort {
    public int[] sort(int n){
        int sum=0;
        int ar[]=new int[n];
        System.out.println("enter array element");
        for(int i=0;i<n;i++){
            return ar[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]<ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
            if(ar[i]%2==0){

                sum=sum+ar[i];
            }

        }

        System.out.println("Non Increasing Order");
        for(int i=0;i<n-1;i++){
            System.out.println(ar[i]);
        }
        System.out.println(ar[n-1]);
        System.out.println("sum of even num is:" + sum);
        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");
    }
}