package com.interview.stepdefs;

import com.interview.pages.HomePage;
import com.interview.utilitilies.ConfigurationReader;
import com.interview.utilitilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.interactions.Actions;

// SRP - single responsibility principle
// her methodun tek bir gorevi olmali
// bir methodun degismesi icin sadece ve sadece tek bir sebep olmali.

// SOLID -


public class RegisterStepDefinitions {

    HomePage homePage = new HomePage();

    @Given("user should be on the homepage {string}")
    public void userShouldBeOnTheHomepage(String url) throws InterruptedException {
        Driver.get().get(ConfigurationReader.getProperty(url));
        Thread.sleep(2000l);
    }

    @Then("user should hover the sign in menu")
    public void userShouldHoverTheSignInMenu() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(homePage.signInMenu).perform();
    }

    @Then("user should click start here link")
    public void userShouldClickStartHereLink() {
        homePage.startHereLink.click();
    }

    @Then("user should enter {string}")
    public void userShouldEnter(String arg0) {
    }

    @Then("user should re-enter {string}")
    public void userShouldReEnter(String arg0) {
    }

    @Then("user should click create account button")
    public void userShouldClickCreateAccountButton() {
    }

    @Then("the new page title should be {string}")
    public void theNewPageTitleShouldBe(String arg0) {
    }
}
