package com.danjerous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static final String EXEC_CHROME_DRIVER  = "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59";

    public static void main(String[] args) {
	// write your code here

        // First thing first, we need to create and set the web browser driver object before to do anything.

        System.setProperty("webdriver.chrome.driver", EXEC_CHROME_DRIVER);

        WebDriver chromeDriver = new ChromeDriver();





        

    }
}
