package com.danjerous.qa.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {
    private WebDriver driver;

    @FindBy(id = "login1")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@name='proceed']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement homeButton;

    public RediffLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement emailId() {
        return username;
    }

    public WebElement password() {
        return password;
    }

    public WebElement submit() {
        return loginButton;
    }

    public WebElement home() {
        return homeButton;
    }
}
