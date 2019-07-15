package com.stackroute.pe1;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public String gussNumber(int n,int m){

        if (n >= 1 && n <= 100) {
            System.out.println("guess the number");

            if (m > n)
                return ("number guessed is more than original number");
            else if (m < n)
                return ("number guessed is less than original number");
            else
                return ("number guessed is matches original number");
        }
        return null;

    }
}

