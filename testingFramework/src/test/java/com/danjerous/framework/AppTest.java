package com.danjerous.framework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest  extends Base
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException {
        WebDriver driver = initializeDriver();
        driver.get("http://www.google.com");

        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
