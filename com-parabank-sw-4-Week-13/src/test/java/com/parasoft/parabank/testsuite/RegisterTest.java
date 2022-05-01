package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homepage = new HomePage();
    RegisterPage registerpage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){

        homepage.clickOnRegisterLink();
        String actualMessage = registerpage.getSigningUpDisplayText();
        Assert.assertEquals(actualMessage,"Signing up is easy!","error");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        homepage.clickOnRegisterLink();
        registerpage.enterFirstName("Ramesh");
        registerpage.enterLastName("Patel");
        registerpage.enterAddress("123 High Street");
        registerpage.enterCity("London");
        registerpage.enterState("London");
        registerpage.enterZipCode("EC17YW");
        registerpage.enterPhoneNumber("12345678");
        registerpage.enterSsnNumber("1234");
        registerpage.enterUserName("Ramesh@gmail.com");
        registerpage.enterPassword("Ramesh123");
        registerpage.enterConfirmPassword("Ramesh123");
        registerpage.clickOnRegisterButton();
        String actualMessage = registerpage.getAccountCreatedSuccessDisplayText();

        Assert.assertEquals(actualMessage,"Your account was created successfully. You are now logged in.","error");
   }
}
