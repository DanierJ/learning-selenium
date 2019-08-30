package com.danjerous;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
    public static void main(String[] args) {

        Browser.CHROME.setSystemProperty();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        WebElement selectElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(selectElement);

        select.selectByValue("USD");
        select.selectByIndex(2);
        select.selectByVisibleText("INR");

    }
}
