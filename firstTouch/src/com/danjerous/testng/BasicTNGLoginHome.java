package com.danjerous.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicTNGLoginHome {

    @BeforeSuite
    public void generalPreRequisite() {
        System.out.println("I run before any test on any test. [Before Suite]");
    }


    @Test
    public void webLoginHomeLoan() {
        // Selenium
        System.out.println("Web login home");
    }

    @Test
    public void mobileLoginHomeLoan() {
        // Appium
        System.out.println("Mobile login home");

    }

    @Test
    public void loginAPIHomeLoan() {
        // REST API automation
        System.out.println("Login home rest api");
    }

    @AfterSuite
    public void generalPostRequisite() {
        System.out.println("I run after any test on any test. [After Suite]");
    }
}
