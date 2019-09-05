package com.danjerous.testng;

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

    @Test
    public void loginAPICarLoan() {
        // REST API automation
        System.out.println("Login car rest api ");
    }
}
