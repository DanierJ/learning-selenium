package com.danjerous.testng;

import org.testng.Assert;
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
}
