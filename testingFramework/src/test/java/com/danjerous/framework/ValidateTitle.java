package com.danjerous.framework;

import com.danjerous.framework.page_objects.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class ValidateTitle extends Base {
    private WebDriver driver;


    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get(getProperty("url"));

        LandingPage landingPage = new LandingPage(driver);

        assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");
    }
}
