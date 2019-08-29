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

        // Getting some data from the page.
        System.out.println( chromeDriver.getTitle());
    }
}
