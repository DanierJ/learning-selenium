package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    private static final String CHROME_DRIVER_EXEC = "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\chromedriver.exe";

    public static final String CHROME_DRIVER_KEY_VALUE = "webdriver.chrome.driver";

    public static void main(String[] args) {
        System.setProperty(CHROME_DRIVER_KEY_VALUE, CHROME_DRIVER_EXEC);
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");

        // finding an element by id.
        driver.findElement(By.id("email")).sendKeys("testing@test.com");

    }
}
