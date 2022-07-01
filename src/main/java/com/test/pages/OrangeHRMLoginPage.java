package com.test.pages;

import com.test.enums.WaitStrategy;
import com.test.reports.ExtentManager;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {

    private final By textboxUsername = By.id("txtUsername");
    private final By textboxPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin     = By.id("btnLogin");

    public OrangeHRMLoginPage enterUserName(String username) {
        sendKeys(textboxUsername, username, WaitStrategy.PRESENCE);
        ExtentManager.getTest().pass("Username entered");
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password) {
        sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
        ExtentManager.getTest().pass("Password entered");
        return this;
    }

    public OrangeHRMHomePage clickLogin(){
        click(buttonLogin, WaitStrategy.CLICKABLE);
        ExtentManager.getTest().pass("Login clicked");
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return getPageTitle();
    }

}
