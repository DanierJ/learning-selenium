package com.danjerous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {
    private static final WebDriver driver;

    static {
        // Desired capabilities.
        DesiredCapabilities ch = DesiredCapabilities.chrome();
        // General chrome profile
        ch.acceptInsecureCerts(); //deprecated
        // ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        // Belongs to your local browser
        ChromeOptions chromeOptions = new ChromeOptions();
       //  chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.merge(ch);
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver(ch);

    }

    public static void main(String[] args) {

    }
}
