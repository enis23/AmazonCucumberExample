package com.interview.stepdefs;

import com.interview.pages.HomePage;
import com.interview.pages.RegisterPage;
import com.interview.utilitilies.ConfigurationReader;
import com.interview.utilitilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

// SRP - single responsibility principle
// her methodun tek bir gorevi olmali
// bir methodun degismesi icin sadece ve sadece tek bir sebep olmali.

// SOLID -


public class RegisterStepDefinitions {

    HomePage homePage = new HomePage();
    RegisterPage registerPage =  new RegisterPage();

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
    public void userShouldClickStartHereLink() throws InterruptedException {
        homePage.startHereLink.click();
        Thread.sleep(3000l);
    }

    @Then("user should enter fullName{string}")
    public void userShouldEnterFullName(String fullName) {
        registerPage.userNameTextBox.sendKeys(fullName + Keys.TAB);
    }

    @Then("user should enter email{string}")
    public void userShouldEnterEmail(String email) {
        registerPage.emailTextBox.sendKeys(email + Keys.TAB);
    }

    @Then("user should enter password{string}")
    public void userShouldEnterPassword(String password) {
        registerPage.passwordTextBox.sendKeys(password+ Keys.TAB);
    }

    @Then("user should re-enter password{string}")
    public void userShouldReEnterPassword(String passwordConfirmation) {
        registerPage.passwordConfirmationTextBox.sendKeys(passwordConfirmation+ Keys.TAB);
    }


    @Then("user should click create account button")
    public void userShouldClickCreateAccountButton() throws InterruptedException {
        registerPage.createAccountButton.click();
        Thread.sleep(2000l);
    }

    @Then("the new page title should be {string}")
    public void theNewPageTitleShouldBe(String title) {
        Assert.assertEquals(title,Driver.get().getTitle());
    }


}
