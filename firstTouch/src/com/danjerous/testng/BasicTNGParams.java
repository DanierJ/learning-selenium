package com.danjerous.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTNGParams {

    @Parameters({"URL"})
    @Test(groups = {"Smoke"})
    public void workingWithParameters(String urlname) {
        System.out.println("Parameters: " + urlname);
    }
}
