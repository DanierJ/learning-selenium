package com.danjerous.globalparam;

import org.testng.annotations.Test;

public class WebDriverTest extends GlobalParams{

    @Test(dependsOnMethods = "login")
    public void reusableComponentTest() {
        System.out.println("I ran after calling Login.");
    }
    
}
