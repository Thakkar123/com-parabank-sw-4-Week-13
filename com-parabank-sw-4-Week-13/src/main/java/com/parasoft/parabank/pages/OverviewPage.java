package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class OverviewPage extends Utility {

    By accountOverviewDisplayText = By.linkText("Accounts Overview");
    By logOutLink = By.linkText("Log Out");



    public String getAccountOverviewDisplayText()
    {
        return getTextFromElement(accountOverviewDisplayText);
    }
    public void clickOnLogOutLink()
    {
        clickOnElement(logOutLink);
    }


}
