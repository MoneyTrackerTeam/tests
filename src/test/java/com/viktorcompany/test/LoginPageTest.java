package com.viktorcompany.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LoginPageTest {
    @Test(description = "User can login with valid credentials")
    @Severity(SeverityLevel.BLOCKER)
    public void checkLoginWithValidCredentials(){
        new LoginPage().openLoginPage()
                .fillUsername("1")
                .fillPassword("1")
                .clickLoginButton();
        new TransactionsPage().checkHeaderDisplayed();
    }

    @Test(description = "User cannot login with invalid credentials")
    @Severity(SeverityLevel.BLOCKER)
    public void checkUserNotLoggedInWithInvalidCredentials(){
        LoginPage page = new LoginPage().openLoginPage()
                .fillUsername("1")
                .fillPassword("2")
                .clickLoginButton();
        assert page.usernameInp.isDisplayed();
    }

    @Test(description = "Username and Password fields are required")
    @Severity(SeverityLevel.CRITICAL)
    public void usernameAndPasswordFieldsAreRequired(){
        LoginPage page = new LoginPage().openLoginPage();
        page.fillUsername("1").clickLoginButton();
        assert page.usernameInp.isDisplayed();
        assert page.passwordInp.has(Condition.attribute("aria-invalid"));
    }
}
