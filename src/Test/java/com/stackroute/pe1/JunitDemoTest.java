package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");
        this.junitDemo = new JunitDemo();

    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        junitDemo = null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");


    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");

    }

    @Test
    public void givenTwoStringShouldReturnConcatedUpperString() {

        //act
        String actualresults = junitDemo.concatAndUpperCase("hello", "world");
        //assert
        assertNotNull(actualresults);
        assertEquals("HELLOWORLD", actualresults);

    }

    @Test
    public void givenAStringAndnullShouldReturnErrorMassege() {
        //arrange
        JunitDemo junitDemo = new JunitDemo();
        //act
        String actualresults = junitDemo.concatAndUpperCase("hello", null);
        //assert
        assertNotNull(actualresults);
        assertEquals("null value not allowed", actualresults);

    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String actualResult = junitDemo.reverseString("Hello");
        //assert
        assertEquals("olleH", actualResult);
    }
}
//        @Test
//    public void givenNullShouldTrowNullPointException(){
//        String actualResult=junitDemo.reverseString(null);
//
//    }
//}