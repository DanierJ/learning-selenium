package com.danjerous;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class WindowCookiesAndScreenshot {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }

    public static void main(String[] args) throws IOException {
        maximizingWindow();
        deletingCookies();
        takeScreenshot();
    }

    public static void maximizingWindow() {
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    public static void deletingCookies() {
        driver.manage().deleteAllCookies();
    }

    public static void takeScreenshot() throws IOException {
        /*TakesScreenshot takesScreenshot = (TakesScreenshot)driver;

        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);*/

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src, new File("C:\\Users\\Danier Javid\\Documents\\libs\\screenshot.png"));


    }
}
