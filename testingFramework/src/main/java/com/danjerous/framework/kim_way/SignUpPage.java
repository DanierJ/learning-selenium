package com.danjerous.framework.kim_way;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "signUp")
    private WebElement submitButton;

    public void enterName(String firstName, String lastName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public ReceiptPage submit() {
        submitButton.click();
        return new ReceiptPage(driver);
    }



}
