package com.danjerous.globalparam;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalParams {
    @BeforeSuite
    public void Login() throws IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Danier Javid\\Desktop\\Courses\\selenium\\firstTouch\\src\\com\\danjerous\\globalparam\\datadriver.properties")); // To get the input file

        properties.load(fileInputStream);



        System.out.println("Username: " + properties.getProperty("username"));

        // driver.findElement(By.xpath("")).sendKeys(username);
    }

    @Test
    public void software() {
        System.out.println("I'm the Test");
    }

    @AfterSuite
    public void uninstallSoftware() {
        System.out.println("I'm the Last");
    }
}
