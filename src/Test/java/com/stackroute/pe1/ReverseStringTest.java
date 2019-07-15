package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverse;

    @Before
    public void setup() {
        //arrange
        System.out.println("Inside Before");
        reverse = new ReverseString();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        reverse= null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }



 @Test
public void givenStringShouldReturnTheReverse()
 {
     String actualResult = reverse.reverseString("Hello");
     assertEquals("olleH", actualResult);

 }
}