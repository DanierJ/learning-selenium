package com.danjerous;

import org.openqa.selenium.*;
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


    public static void autosuggestive() {
        driver.get("hh");

        // 1. Get the input

        // 2. Send the keys

        // 3. loop through all the suggestions.

        // 4. compare the text displayed on the input.

        // 5. if found break else continue.

        driver.findElement(By.id("selector")).click();

        driver.findElement(By.id("selector")).sendKeys("ben");

        // Javascript DOM can extract hidden elements
        // because selenium cannot identify hidden elements
        // investigate the properties of object if it have any hidden text
        /// How to use javascript with java --> JavascriptExecutor.
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script = "return document.getElementById(\"id\").value";
        String text = ((String)js.executeScript(script));

        System.out.println(text);
        String firstText = text;

        while(!text.equalsIgnoreCase("comparison")) {
            driver.findElement(By.id("selector")).sendKeys(Keys.DOWN);

            /*if ( driver.findElement(By.id("selector")).getText().equalsIgnoreCase("comparision")) {
                flag = false;
                System.out.println("FOUND!!");
            }*/

            text = ((String)js.executeScript(script));
            System.out.println(text);

        }

        do {
            driver.findElement(By.id("selector")).sendKeys(Keys.DOWN);

            if (text.equalsIgnoreCase("comparison")){

                System.out.println("FOUND!");
            }

        } while (!text.equalsIgnoreCase("comparison"));








    }

}
