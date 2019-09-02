package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();
    }

    public static void main(String[] args) {
        staticCheckboxes();
    }

    public static void staticCheckboxes() {
        driver.get("https://www.spicejet.com/");

        driver.findElements(By.xpath("//div[@id='discount-checkbox']//input[@type='checkbox']")).forEach(webElement -> {
            if(!webElement.isSelected()) {
                webElement.click();
            }
        });

        System.out.println(driver.findElements(By.xpath("//div[@id='discount-checkbox']//input[@type='checkbox']")).size());

    }
}
