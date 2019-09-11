package com.danjerous.framework;

import com.danjerous.framework.page_objects.LandingPage;
import com.danjerous.framework.page_objects.LoginPage;
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

        LoginPage loginPage = new LoginPage(driver);

        loginPage.getEmail().sendKeys("test@test.com");
        loginPage.getPassword().sendKeys("test");

        loginPage.getLogin().click();
    }
}
