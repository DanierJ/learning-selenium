package com.danjerous.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTNGLoginHome {

    @BeforeSuite
    public void generalPreRequisite() {
        System.out.println("I run before any test on any test. [Before Suite]");
    }

    @Parameters({"personalLoanUrl", "username"})
    @Test
    public void webLoginHomeLoan(String url, String username) {
        // Selenium
        System.out.println("Web login home, url: " + url + ", username: " + username);
    }

    @Test
    public void mobileLoginHomeLoan() {
        // Appium
        System.out.println("Mobile login home");

    }

    @Test(groups = {"Smoke"})
    public void loginAPIHomeLoan() {
        // REST API automation
        System.out.println("Login home rest api");
    }

    @AfterSuite
    public void generalPostRequisite() {
        System.out.println("I run after any test on any test. [After Suite]");
    }
}
