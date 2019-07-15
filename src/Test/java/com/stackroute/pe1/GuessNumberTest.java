package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guess;
    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        guess=new GuessNumber();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        guess=null;
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }


    @Test
    public void givenNumberShouldReturn() {
        int temp=50,temp1=60;
        String actualResult=guess.gussNumber(temp,temp1);
        String expectedResult="number guessed is more than original number";
        assertEquals(expectedResult,actualResult);

    }
}