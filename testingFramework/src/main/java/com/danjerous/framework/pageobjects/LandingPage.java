package com.danjerous.framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    private WebDriver driver;

    private By signIn = By.cssSelector("a[href*='sign_in']");

    private By title = By.xpath("//h2[contains(text(),'Featured Courses')]");

    private By navigationBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']");

    private By popUp = By.xpath("//button[contains(text(),'NO THANKS')]");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement signIn() {
        return this.driver.findElement(signIn);
    }

    public WebElement getTitle() {
        return this.driver.findElement(title);
    }

    public WebElement getNavigationBar() {
        return this.driver.findElement(navigationBar);
    }

    public int getPopUpSize() {
        return this.driver.findElements(popUp).size();
    }

    public WebElement getPopUp() {
        return this.driver.findElement(popUp);
    }
}
