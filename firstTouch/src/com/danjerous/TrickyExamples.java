package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrickyExamples {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }

    public static void main(String[] args) {

    }

    public static void captcha() {
        int number = findFrameNumber(By.xpath("selector"));

        driver.switchTo().frame(number);
    }

    public static int findFrameNumber(By by) {

        int i = 0;
        int count = driver.findElements(By.tagName("iframe")).size();

        for (i = 0; i < count; i++) {
         driver.switchTo().frame(i);

         int c = driver.findElements(by).size();

             if (c > 0) { // To check if is present or not
                 driver.findElement(by).click();
                 break;
             }
        }

        driver.switchTo().defaultContent();

        return i;
    }

}
