package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();
    }

    public static void main(String[] args) {
        handlingAlerts();
    }

    public static void handlingAlerts() {
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

        driver.findElement(By.xpath("//input[contains(@value, 'Confirmation Alert')]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();




    }
}
