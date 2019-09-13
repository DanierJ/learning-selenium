package stepdefinitions;

import com.danjerous.framework.Base;
import com.danjerous.framework.pageobjects.LandingPage;
import com.danjerous.framework.pageobjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class StepDefinition extends Base implements En {
    private WebDriver driver;

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws IOException {
        driver = initializeDriver();

    }
   /* public void us() { With Lambdas!!!
        Given("^Initialize the browser with chrome$", () -> {
            try {
                driver = initializeDriver();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }*/


    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getEmail().sendKeys(username);
        loginPage.getPassword().sendKeys(password);

        loginPage.getLogin().click();
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getEmail().sendKeys(username);
        loginPage.getPassword().sendKeys(password);

        loginPage.getLogin().click();
    }

    @Then("^Verify taht user is successfully log in$")
    public void verify_taht_user_is_successfully_log_in() {
        Assert.assertEquals("Verifying that the user loged in", "QaClickAcademy", driver.getTitle());
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String site) {
        driver.get(site);
    }

    @And("^Click on logs in link in home page to land on sign in page$")
    public void click_on_logs_in_link_in_home_page_to_land_on_sign_in_page() {
        LandingPage landingPage = new LandingPage(driver);

        if (landingPage.getPopUpSize() > 0) {
            landingPage.getPopUp().click();
        }

        landingPage.signIn().click();
    }

    @And("^Close browsers$")
    public void close_browsers() {
        driver.close();
    }
}
