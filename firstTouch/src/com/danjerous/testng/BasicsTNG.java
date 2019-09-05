package com.danjerous.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class BasicsTNG {

    @BeforeClass
    public void classPreRequisite() {
        System.out.println("I run before any method on this class. [Before Class]");
    }

    @BeforeMethod
    public void methodPreRequisite() {
        System.out.println("I run before any method on this class " + this.getClass().getName() +". [Before Method]");
    }

    @Test(groups = {"Smoke"})
    public void runningWithoutJavaCompiler() {
        System.out.println("Hello world");
    }

    @Test(dependsOnMethods = "runningWithoutJavaCompiler") // Tells what methods depends on to be executed.
    public void anotherTest() {
        Assert.assertTrue(true);
    }

    @Test(enabled = false) // Skip the method when executing.
    public void anotherTherTest() {
        System.out.println("anotherTherTest");
    }

    @Test(timeOut = 3000) // It will wait for failing until the limit is reached.
    public void takingTooMuchTime() {
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
