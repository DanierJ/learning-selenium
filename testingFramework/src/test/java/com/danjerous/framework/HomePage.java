package com.danjerous.framework;

import com.danjerous.framework.page_object.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {


    @Test
    public void basePageNavigation() throws IOException {
        WebDriver driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com");

        LandingPage landingPage = new LandingPage(driver);

        landingPage.getLogin().click();
    }
}
