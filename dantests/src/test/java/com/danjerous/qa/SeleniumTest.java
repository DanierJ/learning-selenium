package com.danjerous.qa;


import org.testng.annotations.Test;

public class SeleniumTest {

   @Test
    public void browserAutomation() {
       System.out.println("Browser Automation.");
       System.out.println("mvn -Dtest=SeleniumTest test.");
   }

   @Test
    public void uiElements() {
       System.out.println("Ui Elements");
   }
}
