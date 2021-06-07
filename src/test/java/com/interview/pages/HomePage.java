package com.interview.pages;

import com.interview.utilitilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id="nav-link-accountList-nav-line-1")
    public WebElement signInMenu;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-newCust']/a")
    public WebElement startHereLink;

}
