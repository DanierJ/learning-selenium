package com.danjerous.framework;

import com.danjerous.framework.page_objects.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {
    private WebDriver driver;

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");

        LandingPage landingPage = new LandingPage(driver);

        landingPage.signIn().click();
    }
}
