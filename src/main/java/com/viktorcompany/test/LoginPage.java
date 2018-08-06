package com.viktorcompany.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final SelenideElement usernameInp;
    private final SelenideElement passwrodInp;
    private final SelenideElement loginBtn;

    public LoginPage(){
        usernameInp = $("#mat-input-0");
        passwrodInp = $("#mat-input-1");
        loginBtn = $(By.cssSelector("body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > mat-card > mat-card-actions > button"));
    }

    @Step("Open {url}")
    public LoginPage openLoginPage(String url){
        open(url);
        return  this;
    }

    @Step("Fill username")
    public LoginPage fillUsername (String value){
        usernameInp.setValue(value);
        return  this;
    }
    @Step("Fill password")
    public LoginPage fillPassword (String value){
        passwrodInp.setValue(value);
        return  this;
    }

    @Step("Click Login button")
    public LoginPage clickLoginButton (){
        loginBtn.click();
        return this;
    }
}
