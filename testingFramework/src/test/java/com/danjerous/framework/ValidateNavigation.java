package com.danjerous.framework;

import com.danjerous.framework.page_objects.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ValidateNavigation extends Base {

    private WebDriver driver;


    @BeforeTest
    public void init() throws IOException {
        driver = initializeDriver();
        driver.get(getProperty("url"));
    }

    @Test
    public void navigationVisibilityTest() {

        LandingPage landingPage = new LandingPage(driver);
        Assert.assertTrue(landingPage.getNavigationBar().isDisplayed());
    }
}
