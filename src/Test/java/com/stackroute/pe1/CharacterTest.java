package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class CharacterTest {

    Character chara;

    @Before
    public void setup() {
        //arrange
        System.out.println("Inside Before");
        chara = new Character();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        chara= null;
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
    public void givenCharShouldReturnCaseValue(){
        char ch='a';
        String results=chara.character(ch);
        assertEquals("Small letter",results);
    }
    }
