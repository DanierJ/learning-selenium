package com.danjerous.testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsTNG {

    @Test
    public void runningWithoutJavaCompiler() {
        System.out.println("Hello world");
    }

    @Test
    public void anotherTest() {
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void preRequisite() {
        System.out.println("I run before any test on Personal Loan.");
    }

    @AfterTest
    public void postRequisite() {
        System.out.println("I run after any test on Personal Loan.");
    }
}
