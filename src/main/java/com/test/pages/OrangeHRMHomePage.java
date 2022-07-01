package com.test.pages;

import com.test.enums.WaitStrategy;
import com.test.reports.ExtentManager;
import com.test.reports.ExtentReport;
import org.openqa.selenium.By;

public final class OrangeHRMHomePage extends BasePage {

    private final By linkWelcome = By.id("welcome");
    private final By linkLogout = By.xpath("//div[@id='welcome-menu']//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome() {
        click(linkWelcome, WaitStrategy.PRESENCE);
        ExtentManager.getTest().pass("Welcome clicked");
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {
        /*
        Way to avoid try/catch block, add to pom file an apache library
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        */

        click(linkLogout, WaitStrategy.CLICKABLE);
        ExtentManager.getTest().pass("Logout button clicked");
        return new OrangeHRMLoginPage();
    }
}
