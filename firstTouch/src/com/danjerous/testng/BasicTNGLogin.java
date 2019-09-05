package com.danjerous.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTNGLogin {

    @Test
    public void webLoginCarLoan() {
        // Selenium
        System.out.println("Web login car");
    }

    @Test
    public void mobileLoginCarLoan() {
        // Appium
        System.out.println("Mobile login car");

    }

    @Test
    public void mobilePayment() {
        // Appium
        System.out.println("Mobile payment car");

    }
    @Test
    public void mobileChar() {
        // Appium
        System.out.println("Mobile char car");

    }

    @Parameters({"carLoanUrl"})
   // @Test(groups = {"Smoke"})
    public void loginAPICarLoan(String url) {
        // REST API automation
        System.out.println("Login car rest api: " + url);
    }

    @BeforeTest
    public void preRequisite() {
        System.out.println("I run before any test on Car Loan. [Before Test]");
    }

    @AfterTest
    public void postRequisite() {
        System.out.println("I run after any test on Car Loan. [After Test]");
    }
}
