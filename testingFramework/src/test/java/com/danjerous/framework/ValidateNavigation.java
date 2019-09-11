package com.danjerous.framework;

import com.danjerous.framework.page_objects.NavigationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ValidateNavigation extends Base {

    private WebDriver driver;

    @Test
    public void navigationVisibilityTest() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");

        NavigationPage navigationPage = new NavigationPage(driver);


        Assert.assertTrue(navigationPage.getNavigation().isDisplayed());


    }
}
