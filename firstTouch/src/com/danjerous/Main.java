package com.danjerous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static final String CHROME_DRIVER_EXEC = "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\chromedriver.exe";

    public static void main(String[] args) {
	// write your code here

        // First thing first, we need to create and set the web browser driver object before to do anything.

        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_EXEC);
        WebDriver chromeDriver = new ChromeDriver();

        // Invoking web browser at the specified url
        chromeDriver.get("http://www.google.com");

        System.out.println("Title:");
        // Getting some data from the page.
        System.out.println( chromeDriver.getTitle()); // Validate if title is correct
        System.out.println("\n");

        System.out.println("Current url:");
        System.out.println(chromeDriver.getCurrentUrl()); // Validate if you're in the correct page
        System.out.println("\n");


       // System.out.println("Page source:");
       // System.out.println(chromeDriver.getPageSource());

        chromeDriver.get("http://www.facebook.com");

        System.out.println("Current url:");
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("\n");


        System.out.println("Current url:");
        chromeDriver.navigate().back();
        System.out.println("\n");



        System.out.println("Current url:");
        chromeDriver.navigate().forward();
        System.out.println("\n");


       // System.out.println("Closing browser");
       // chromeDriver.close(); // Closing the test in the browser - closes current browser
        // chromeDriver.quit(); // close all the browsers opened by Selenium







    }
}
