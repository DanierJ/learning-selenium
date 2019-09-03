package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTests {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }

    public static void main(String[] args) {
        dragAndDrop();
    }

    public static void dragAndDrop() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
       // driver.switchTo().frame(0); // first frame in the page. Not recommended due to changes
        // driver.findElement(By.id("draggable")).click();

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        actions
                .dragAndDrop(source, target)
                .build()
                .perform();


        driver.switchTo().defaultContent();
        int divNumber = driver.findElements(By.tagName("div")).size();

        System.out.println(divNumber);

    }
}
