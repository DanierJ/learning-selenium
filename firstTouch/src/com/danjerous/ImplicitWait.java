package com.danjerous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    private static final WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
     driver.get("https://alaskatrips.poweredbygps.com/");
     driver.findElement(By.cssSelector("label[for='hotel-car-package-type-hp-package']")).click();

     driver.findElement(By.id("hotel-destination-hp-package")).click();
     driver.findElement(By.id("hotel-destination-hp-package")).sendKeys("nyc");

     driver.findElement(By.cssSelector("label[for='package-hc-departing-hp-package']")).click();
     driver.findElement(By.cssSelector("button[data-month='8'][data-day='9']")).click();

     driver.findElement(By.cssSelector("label[for='package-hc-returning-hp-package']")).click();
     driver.findElement(By.cssSelector("button[data-month='8'][data-day='12']")).click();

     driver.findElement(By.id("package-hc-departing-hp-package")).sendKeys(Keys.ENTER);

     driver.findElement(By.xpath("//a[contains(text(),'New York, NY, United States (JFK-John F. Kennedy I')]")).click();


     driver.findElement(By.cssSelector("a[target='17117062']")).click();

    }
}
