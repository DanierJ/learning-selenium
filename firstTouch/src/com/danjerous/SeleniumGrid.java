package com.danjerous;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
    public static void main(String[] args) throws MalformedURLException {
        // http://192.168.1.72:4444/grid/register/
        // http://192.168.1.72:4444/wd/hub


        // DesiredCapabilities -> When remote you tell your test what are the conditions that it must to have in order to get executed.

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);

        driver.get("http://www.google.com");

        //


    }
}
