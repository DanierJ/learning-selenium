package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void userIsOnNetBankingLandingPage() {
        System.out.println("I'm the user who is on the landing page");
    }

    @When("^User logins into application with username and password$")
    public void userLoginsIntoApplicationWithUsernameAndPassword() {
        System.out.println("I logged in with username and password");
    }

    @Then("^Home page is populated$")
    public void homePageIsPopulated() {
        System.out.println("Home page gets populated");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("Cards are displayed");
    }
}
