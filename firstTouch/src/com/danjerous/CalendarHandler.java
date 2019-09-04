package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalendarHandler {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();

    }


    public static void main(String[] args) {
        handlingCalendar();
    }

    public static void handlingCalendar() {
        driver.get("https://www.path2usa.com/travel-companions");

        // 1.Open the calendar

        // 2.Get the elements of the calendar

        // 3.Traverse through all the elements and find what you want. Maybe with a loop or using locators.

        // Likewise, when searching for the month/year you need to loop through the elements until you find the date.


        // rahul way:

        driver.findElement(By.xpath("//*[@id='travel_date']")).click();


        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }

        List<WebElement> dates = driver.findElements(By.className("day"));


        int count = dates.size();

        for (int i = 0; i < count; i++) {
            String text = dates.get(i).getText();

            if (text.equalsIgnoreCase("21")) {
                dates.get(i).click();
                break;
            }
        }
    }
}
