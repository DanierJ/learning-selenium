package com.danjerous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

    private static final String IE_DRIVER_EXEC = "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\microsoftWebDriver.exe";

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", IE_DRIVER_EXEC);

        WebDriver IEDriver = new
                InternetExplorerDriver();

        IEDriver.get("http://www.google.com");

        System.out.println(IEDriver.getCurrentUrl());

        // DISM.exe /Online /Add-Capability /CapabilityName:Microsoft.WebDriver~~~~0.0.1.0 para tener el driver
    }
}
