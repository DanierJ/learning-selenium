package com.danjerous.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class BasicsTNG {

    @BeforeMethod
    public void methodPreRequisite() {
        System.out.println("I run before any method on this class " + this.getClass().getName() +". [Before Method]");
    }

    @Test
    public void runningWithoutJavaCompiler() {
        System.out.println("Hello world");
    }

    @Test
    public void anotherTest() {
        Assert.assertTrue(true);
    }
    @Test
    public void anotherTherTest() {
        System.out.println("anotherTherTest");
    }

    @BeforeTest
    public void preRequisite() {
        System.out.println("I run before any test on Personal Loan. [Before test]");
    }

    @AfterTest
    public void postRequisite() {
        System.out.println("I run after any test on Personal Loan. [After test]");
    }

    @AfterSuite
    public void thirdAfterSuite() {
        System.out.println("I'm the third suite. [Third After Suite]");
    }
}
