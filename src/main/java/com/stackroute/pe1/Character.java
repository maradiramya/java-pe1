package com.stackroute.pe1;

import java.util.Scanner;

public class Character {
    public String character(char c)
    {
        if(c>=65 && c<=90)
            return ("capital letter");
        else if(c>=97 && c<=122)
            return ("Small letter");
        else if(c>=48 && c<=57)
            return ("numbers");
        else
            return("SpecialCharacter");

    }

}
