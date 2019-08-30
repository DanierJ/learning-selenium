package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
    public static void main(String[] args) {
        Browser.CHROME.setSystemProperty();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testing@xpath.com");

        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1123");

        driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();

        // custom css: tagName[attribute='value']

        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("danier_1996@hotmail.com");

        // Regular expressions - xpath
        /*
           //tagName[contains(@attribute, 'value')]


           css equivalent: tagName[attribute*='value']

         */

        driver.findElement(By.xpath("//input[contains(@id, 'pass')]")).sendKeys("1234");



    }
}
