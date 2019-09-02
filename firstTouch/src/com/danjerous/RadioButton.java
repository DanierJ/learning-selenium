package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();
    }
    public static void main(String[] args) {
        driver.get("https://www.w3schools.com/html/html_forms.asp");

        driver.findElement(By.xpath("//body//input[4]")).click();

        System.out.println(driver.findElements(By.xpath("//input[@name='gender']")).size());

    }
}
