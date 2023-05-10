package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement emailField;

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }
}
