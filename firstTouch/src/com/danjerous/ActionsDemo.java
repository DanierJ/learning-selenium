package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }
    public static void main(String[] args) {
        onMouseOver();
    }

    public static void onMouseOver() {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions actions = new Actions(driver);

        actions
               .moveToElement(driver.findElement(By.id("nav-link-accountList")))
               .build()
               .perform();
    
        actions
                .moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("playstation")
                .build()
                .perform();
    }
}
