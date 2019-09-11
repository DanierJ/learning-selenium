package com.danjerous.framework;

import com.danjerous.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    private WebDriver driver;


    public WebDriver initializeDriver() throws IOException {

        return setDriver(getProperty("browser"));

    }

    private WebDriver setDriver(String browser) {

        if (browser.equalsIgnoreCase(Browser.CHROME.toString())) {
            Browser.CHROME.setSystemProperty();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase(Browser.FIREFOX.toString())) {

            Browser.FIREFOX.setSystemProperty();
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }


    public String getProperty(String property) throws IOException {
        Properties properties = new Properties();

        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Danier Javid\\Desktop\\Courses\\selenium\\testingFramework\\src\\main\\java\\com\\danjerous\\framework\\class_resources\\data.properties"));
        properties.load(fileInputStream);

        return  properties.getProperty(property);
    }


}
