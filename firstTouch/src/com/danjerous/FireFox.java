package com.danjerous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireFox {
    private static final String FIREFOX_DRIVER_EXEC = "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\geckodriver.exe";

    public static void main(String[] args) {
        //// FIREFOX
        System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER_EXEC);

        WebDriver firefoxDriver = new FirefoxDriver();


        firefoxDriver.get("http://www.google.com");

        System.out.println(firefoxDriver.getPageSource());
    }
}
