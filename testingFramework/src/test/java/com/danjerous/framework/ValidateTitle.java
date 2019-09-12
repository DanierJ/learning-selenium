package com.danjerous.framework;

import com.danjerous.framework.page_objects.LandingPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class ValidateTitle extends Base {
    private WebDriver driver;

    private static Logger log = LogManager.getLogger(ValidateTitle.class.getName());

    @BeforeTest
    public void init() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized.");

        driver.get(getProperty("url"));
        log.info("Navigate to Home page.");
    }

    @Test
    public void basePageNavigation() {
        LandingPage landingPage = new LandingPage(driver);

        assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");
        log.info("Successfully validated");
    }
}
