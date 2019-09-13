package com.danjerous.framework.pageobjects;

import com.danjerous.framework.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {
    private WebDriver driver;
    private By emailInput = By.id("user_email");
    private By passwordInput = By.cssSelector("[type='password']");
    private By loginButton = By.name("commit");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement getEmail() {
        return this.driver.findElement(emailInput);
    }

    public WebElement getPassword() {
        return this.driver.findElement(passwordInput);
    }

    public WebElement getLogin() {
        return this.driver.findElement(loginButton);
    }


}

