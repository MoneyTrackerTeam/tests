package com.viktorcompany.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class TransactionsPage {
    private final SelenideElement allTransHeader;
    public TransactionsPage(){
        allTransHeader = $("body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-transactions > div > div > h3");
    }

    @Step("All transcations header displayed")
    public TransactionsPage checkHeaderDisplayed(){
        allTransHeader.shouldBe(Condition.visible);
        return this;
    }
}
