package com.test.pages;

import com.test.driver.DriverManager;
import org.openqa.selenium.By;

public class OrangeHRMHomePage {

    private final By linkWelcome = By.id("welcome");
    private final By logoutButton = By.xpath("//div[@id='welcome-menu']//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome() {
        DriverManager.getDriver().findElement(linkWelcome).click();
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {
        DriverManager.getDriver().findElement(logoutButton).click();
        return new OrangeHRMLoginPage();
    }

}
