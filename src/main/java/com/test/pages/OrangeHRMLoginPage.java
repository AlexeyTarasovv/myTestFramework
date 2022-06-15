package com.test.pages;

import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {

    private final By textboxUsername = By.id("txtUsername");
    private final By textboxPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin     = By.id("btnLogin");

    public OrangeHRMLoginPage enterUserName(String username) {
        sendKeys(textboxUsername, username, "present");
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password) {
        sendKeys(textboxPassword, password, "present");
        return this;
    }

    public OrangeHRMHomePage clickLogin(){
        click(buttonLogin, "clickable");
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return getPageTitle();
    }

}
