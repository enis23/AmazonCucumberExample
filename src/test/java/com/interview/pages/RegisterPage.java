package com.interview.pages;

import com.interview.utilitilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "ap_customer_name")
    public WebElement userNameTextBox;

    @FindBy(id = "ap_email")
    public WebElement emailTextBox;

    @FindBy(id = "ap_password")
    public WebElement passwordTextBox;

    @FindBy(id = "ap_password_check")
    public WebElement passwordConfirmationTextBox;

    @FindBy(id = "continue")
    public WebElement createAccountButton;





}
