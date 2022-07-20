package com.test.pages;

import com.test.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {

    private final By textboxUsername = By.id("txtUsername");
    private final By textboxPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin     = By.id("btnLogin");

    public OrangeHRMLoginPage enterUserName(String username) {
        sendKeys(textboxUsername, username, WaitStrategy.PRESENCE, "Username");
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password) {
        sendKeys(textboxPassword, password, WaitStrategy.PRESENCE, "Password");
        return this;
    }

    public OrangeHRMHomePage clickLogin(){
        click(buttonLogin, WaitStrategy.CLICKABLE, "Login button");
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return getPageTitle();
    }

    public void makeHoverOverLoginBtn(){
        makeHover(buttonLogin, WaitStrategy.PRESENCE, "LoginBtn");
    }
}
