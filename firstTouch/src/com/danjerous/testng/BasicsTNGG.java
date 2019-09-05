package com.danjerous.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class BasicsTNGG {

    @Test
    public void testFromAnotherClass() {
        System.out.println("Hellllloooooo.");
    }

    @AfterSuite
    public void testingTwoAfterSuite() {
        System.out.println("Second after suite. [Second After Suite]");
    }
}
