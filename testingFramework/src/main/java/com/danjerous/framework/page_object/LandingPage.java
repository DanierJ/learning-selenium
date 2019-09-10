package com.danjerous.framework.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginLink = By.cssSelector("a[href*='sign in'");


    public WebElement getLogin() {
        return driver.findElement(loginLink);
    }
}
