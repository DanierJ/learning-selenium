package com.danjerous.globalparam;

import com.danjerous.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalParams {
   private WebDriver driver;

    @Test
    public void login() throws IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Danier Javid\\Desktop\\Courses\\selenium\\firstTouch\\src\\com\\danjerous\\globalparam\\datadriver.properties")); // To get the input file

        properties.load(fileInputStream);
        System.out.println("Username: " + properties.getProperty("username"));
        // driver.findElement(By.xpath("")).sendKeys(username);

        setDriver(properties.getProperty("browser"));

        driver.get(properties.getProperty("url"));
    }

    @Test
    public void software() {
        System.out.println("I'm the Test");
    }

    @AfterSuite
    public void uninstallSoftware() {
        System.out.println("I'm the Last");
    }


    public void setDriver(String browser) {

        if (browser.equalsIgnoreCase(Browser.CHROME.toString())) {
            Browser.CHROME.setSystemProperty();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase(Browser.FIREFOX.toString())) {

            Browser.FIREFOX.setSystemProperty();
            driver = new FirefoxDriver();
        }
    }
}
