package com.viktorcompany.test;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginPageTest {
    @Test
    public void checkLoginWithValidCredentials(){
        new LoginPage().openLoginPage("http://localhost:4200/login")
                .fillUsername("1")
                .fillPassword("1")
                .clickLoginButton();
        new TransactionsPage().checkHeaderDisplayed();
    }
}
