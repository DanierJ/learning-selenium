package com.danjerous;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.Assert.*;

public class Dropdowns {

    private static WebDriver driver;

    static {
        Browser.CHROME.setSystemProperty();
        driver = new ChromeDriver();
    }

    public static void main(String[] args) throws InterruptedException {
        staticDropdownTest();
        Thread.sleep(3000);
        dynamicDrowdownTest();
        Thread.sleep(3000);

        handlingCalendar();


       // autoSuggestedDropdow();
    }

    public static void staticDropdownTest() throws InterruptedException {

        driver.get("https://www.spicejet.com/");
        WebElement selectElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(selectElement);

        select.selectByValue("USD");
        select.selectByIndex(2);
        select.selectByVisibleText("INR");

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        multiClick(driver.findElement(By.id("hrefIncAdt")), 4);


        driver.findElement(By.id("btnclosepaxoption")).click();

        assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult" );

    }

    public static void dynamicDrowdownTest() throws InterruptedException {
       // driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Bhopal (BHO)')]")).click();
        Thread.sleep(2000);

      //  driver.findElement(By.xpath("(//a[contains(text(),'Chennai (MAA)')])[2]")).click(); // Selecting the second matching found


        /// Parent - child relationship locator

        /// //parent//child ---> .parent .child
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Chennai (MAA)')]")).click(); // Selecting the second matching found
    }

    public static void autoSuggestedDropdow() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");

        WebElement fromCityInput = driver.findElement(By.id("fromCity"));

        fromCityInput.click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).clear();

        fromCityInput.sendKeys("MUM");
        Thread.sleep(2000);
        fromCityInput.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[contains(text(), 'Mumbai')]")).click();

        WebElement toCityContainer = driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchToCity inactiveWidget')]//label"));

        Thread.sleep(2000);
        WebElement toCityInput = driver.findElement(By.id("toCity"));

        toCityContainer.click();
        Thread.sleep(2000);
        toCityInput.sendKeys(Keys.ARROW_DOWN);
        toCityInput.sendKeys(Keys.ENTER);


    }

    public static void multiClick (WebElement clickable, int clickNum) {
        for (int i = 0; i < clickNum; i++) {
            clickable.click();
        }
    }

    public static void handlingCalendar() {
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

       /* if (driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()) { // isEnabled possibly doesn't work on few pages due to how it was developed.

        } else {
            driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        }

        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        */

       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
           driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
       }

       driver.findElement(By.id("ctl00_mainContent_view_date2")).click();

       driver.findElement(By.xpath("//td[@data-month='8']//a[text()='22']")).click();

       driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }
}
