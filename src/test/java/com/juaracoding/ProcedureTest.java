package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before method");
    }

    @Test
    public void test1() {
        System.out.println("testone");
    }
    @Test
    public void test2() {
        System.out.println("testtwo");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After method");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After class");
    }
}
