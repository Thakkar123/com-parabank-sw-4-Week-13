package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By registerLink = By.linkText("Register");
    By usernameTextBox = By.name("username");
    By passwordTextBox = By.name("password");
    By loginButton = By.xpath("//input[@value='Log In']");
    By errorMessageDisplayText = By.xpath("//div[@id = 'rightPanel']/child::p");
    By customerLoginDisplayText = By.xpath("//div[@id = 'bodyPanel']/descendant::h2");

    public void clickOnRegisterLink()
    {
        clickOnElement(registerLink);
    }
    public void enterUsername(String username)
    {
        sendTextToElement(usernameTextBox,username);
    }
    public void enterPassword(String password)
    {
        sendTextToElement(passwordTextBox,password);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }
    public String getErrorMessageDisplayText()
    {
        return getTextFromElement(errorMessageDisplayText);
    }
    public String getCustomerLoginDisplayText()
    {
        return getTextFromElement(customerLoginDisplayText);
    }
}
