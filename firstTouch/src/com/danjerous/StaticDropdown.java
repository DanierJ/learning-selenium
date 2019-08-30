package com.danjerous;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
    public static void main(String[] args) throws InterruptedException {

        Browser.CHROME.setSystemProperty();
        WebDriver driver = new ChromeDriver();

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

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }

    public static void multiClick (WebElement clickable, int clickNum) {
        for (int i = 0; i < clickNum; i++) {
            clickable.click();
        }
    }
}
