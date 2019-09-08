package com.danjerous.qa.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
    private WebDriver driver;
    private By username = By.id("login1");
    private By password = By.id("password");
    private By loginButton = By.xpath("//input[@name='proceed']");
    private By homeButton = By.xpath("//a[contains(text(),'Home')]");

    public RediffLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailId() {
        return driver.findElement(username);
    }

    public WebElement password() {
        return driver.findElement(password);
    }

    public WebElement submit() {
        return driver.findElement(loginButton);
    }

    public WebElement home() {
        return driver.findElement(homeButton);
    }
}
