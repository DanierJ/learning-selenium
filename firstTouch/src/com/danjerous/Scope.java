package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }

    public static void main(String[] args) {
        countingLinks();

        countingFooterLinks();
    }

    public static void countingLinks() {
        driver.get("http://www.qaclickacademy.com/practice.php");

        int count = driver.findElements(By.tagName("a")).size();

        System.out.println(count);
    }

    public static void countingFooterLinks() {
        driver.get("http://www.qaclickacademy.com/practice.php");

        // Limiting the scope to a particular section. 
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        int count = footerDriver.findElements(By.tagName("a")).size();


        /*int count = driver.findElements(By.cssSelector("footer a")).size();

        System.out.println(count);*/

    }
}
