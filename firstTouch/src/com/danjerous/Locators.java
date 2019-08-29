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

        // finding element by name
        driver.findElement(By.name("pass")).sendKeys("testing");


        // finding element by linkText
      //  driver.findElement(By.linkText("¿Has olvidado los datos de la cuenta?")).click();

        // classes should not have spaces, it only works with one class 
        driver.get("http://www.colegioalbania.edu.co/");
        // driver.findElement(By.className("cf footer")); // this gives us an error






    }
}
