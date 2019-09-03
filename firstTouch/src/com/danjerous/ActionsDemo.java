package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class ActionsDemo {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }
    public static void main(String[] args) {
        // onMouseOver();
        multipleWindows();
    }

    public static void onMouseOver() {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions actions = new Actions(driver);

        actions
               .moveToElement(driver.findElement(By.id("nav-link-accountList")))
               .build()
               .perform();

        actions
                .moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("playstation")
                .doubleClick()
                .contextClick()
                .build()
                .perform();
    }

    public static void multipleWindows() {
        driver.get("https://getbootstrap.com/docs/4.1/components/modal/");
        driver.findElement(By.xpath("//a[contains(text(),'Themes')]")).click();
        System.out.println(driver.getTitle());

        Set<String> ids = driver.getWindowHandles();

        Iterator<String> iterator = ids.iterator();

        String parentId = iterator.next();
        String childId = iterator.next();

        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());


        // ids.forEach(System.out::println);
    }
}
