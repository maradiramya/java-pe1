package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration ite;

    @Before
    public void setup() {
        //arrange
        System.out.println("Inside Before");
        ite = new Iteration();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        ite= null;
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
    public void givenNumberShouldReturnsTheIterations()
    {
        int m=5;
        int actualRes[]=ite.iteration(m);
        int expectedRes[]={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        assertArrayEquals(expectedRes,actualRes);


    }
}