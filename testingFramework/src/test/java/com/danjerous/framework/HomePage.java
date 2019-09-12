package com.danjerous.framework;

import com.danjerous.framework.page_objects.LandingPage;
import com.danjerous.framework.page_objects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {
    private WebDriver driver;

    @BeforeTest
    public void init() throws IOException {
        driver = initializeDriver();
    }


    @Test(dataProvider = "getData")
    public void basePageNavigation(String username, String password) throws IOException {
        driver.get(getProperty("url"));

        LandingPage landingPage = new LandingPage(driver);

        landingPage.signIn().click();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.getEmail().sendKeys(username);
        loginPage.getPassword().sendKeys(password);

        loginPage.getLogin().click();
    }

    @DataProvider
    public Object[][] getData() {
        // rows: how many data, col: how many parameters
        return new Object[][] {
                {"dani", "dani123"},
                {"javi", "javi123"},
                {"marti", "marti123"},
                {"cami", "cami123"}
        };
    }
}
