package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.OverviewPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homepage = new HomePage();
    OverviewPage overviewpage = new OverviewPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        homepage.enterUsername("Ramesh@gmail.com");
        homepage.enterPassword("Ramesh123");
        homepage.clickOnLoginButton();
        String actualMessage = overviewpage.getAccountOverviewDisplayText();
        Assert.assertEquals(actualMessage,"Accounts Overview","error");
    }
    @Test
    // There is a bug in this site, its let you log in with any credentials, hence this case fail always
    public void verifyTheErrorMessage(){

        homepage.enterUsername("Ramesh@gmail.commm");
        homepage.enterPassword("Ramesh123789");
        homepage.clickOnLoginButton();
        String actualMessage = homepage.getErrorMessageDisplayText();
        Assert.assertEquals(actualMessage,"The username and password could not be verified.","error");
    }
    @Test

    public void userShouldLogOutSuccessfully(){

        homepage.enterUsername("Ramesh@gmail.com");
        homepage.enterPassword("Ramesh123");
        homepage.clickOnLoginButton();
        overviewpage.clickOnLogOutLink();
        String actualMessage = homepage.getCustomerLoginDisplayText();
        Assert.assertEquals(actualMessage,"Customer Login","error");
    }
}
