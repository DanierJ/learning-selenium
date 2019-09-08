package com.danjerous.qa.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RediffLoginPage {
    WebDriver driver;
    By username = By.id("login1");
    By password = By.id("password");
    By loginButton = By.xpath("//input[@name='proceed']");
}
