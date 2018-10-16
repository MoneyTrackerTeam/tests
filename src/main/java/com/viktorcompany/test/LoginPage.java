package com.viktorcompany.test;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public final SelenideElement usernameInp;
    public final SelenideElement passwordInp;
    public final SelenideElement loginBtn;

    public LoginPage(){
        usernameInp = $("#mat-input-0");
        passwordInp = $("#mat-input-1");
        loginBtn = $("#login");
    }

    @Step("Open {url}")
    public LoginPage openLoginPage(){
        open("http://localhost:4200/login");
        return  this;
    }

    @Step("Fill username field with '{value}'")
    public LoginPage fillUsername (String value){
        usernameInp.setValue(value);
        return  this;
    }
    @Step("Fill password field with '{value}'")
    public LoginPage fillPassword (String value){
        passwordInp.setValue(value);
        return this;
    }

    @Step("Click Login button")
    public LoginPage clickLoginButton (){
        loginBtn.click();
        return this;
    }

    @Step("Clear Username and Password fields")
    public LoginPage clearUsernameAndPassword(){
        usernameInp.clear();
        passwordInp.clear();
        return this;
    }
}
