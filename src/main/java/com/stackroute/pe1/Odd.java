package com.stackroute.pe1;

import java.util.Scanner;

public class Odd {
    public String oddNumber(int n){

            if(n>=20 && n<=30){
                if (n % 2 == 0)
                return "Jerry";

            else
                return "Tom";
        }
            if(n==0)
            {
                return ("null value not allowed");
            }
            return null;
    }
}
