package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }

    public static void main(String[] args) {
       countingLinks();

       countingFooterLinks();

       countingFooterFirstColumnLinks();
    }


    // Scope
    public static void countingLinks() {
        driver.get("http://www.qaclickacademy.com/practice.php");

        int count = driver.findElements(By.tagName("a")).size();

        System.out.println(count);
    }

    // Scope
    public static void countingFooterLinks() {

        // Limiting the scope to a particular section.
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        int count = footerDriver.findElements(By.tagName("a")).size();


        /*int count = driver.findElements(By.cssSelector("footer a")).size();

        System.out.println(count);*/

        System.out.println(count);
    }

    // scope
    public static void countingFooterFirstColumnLinks() {


        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        WebElement footerFirstColumn = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        int count = footerFirstColumn.findElements(By.tagName("a")).size();

        System.out.println(count);

        List<WebElement> footerFirstColumnLinks = footerFirstColumn.findElements(By.tagName("a"));

        multiClick(footerFirstColumnLinks);

        getWindowsTitle();

        driver.quit();

    }

    // Opening multiple links on different tabs
    public static void multiClick (List<WebElement> webElementList) {
       // webElementList.forEach(WebElement::click);

        Actions actions = new Actions(driver);

       /* for (int i = 0; i < webElementList.size(); i++) {
            actions
                    .moveToElement(webElementList.get(i))
                    .keyDown(Keys.CONTROL)
                    .click()
                    .build()
                    .perform();
        }

        for (WebElement webElement : webElementList) {
            actions.moveToElement(webElement)
                    .keyDown(Keys.CONTROL)
                    .click()
                    .build()
                    .perform();
        }
        */
       /* webElementList.forEach(webElement -> {
            actions.moveToElement(webElement)
                    .keyDown(Keys.CONTROL)
                    .click()
                    .build()
                    .perform();
        });*/
        webElementList.forEach(webElement -> {
           String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

           webElement.sendKeys(clickOnLink);
        });
    }

    // Getting dynamically the title of all the open tabs.
    public static void getWindowsTitle() {
        Set<String> ids = driver.getWindowHandles();

        ids.forEach(id -> {
            driver.switchTo().window(id);
            System.out.println(driver.getTitle());
        });

        driver.getTitle();
    }

}
