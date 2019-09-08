package com.danjerous.qa.pop;


import com.danjerous.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {


    @Test
    public void login() {
        Browser.CHROME.setSystemProperty();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        RediffLoginPage rd = new RediffLoginPage(driver);

        rd.emailId().sendKeys("dan");
        rd.password().sendKeys("123");
        rd.submit().click();
        rd.home().click();
    }

}
