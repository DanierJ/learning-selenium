package com.danjerous.framework.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {

    private WebDriver driver;

    private By navigation = By.xpath("//ul[@class='nav navbar-nav navbar-right']");


    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getNavigation() {
        return this.driver.findElement(navigation);
    }

}
