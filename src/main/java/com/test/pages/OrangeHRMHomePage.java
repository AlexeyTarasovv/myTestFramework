package com.test.pages;

import com.test.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class OrangeHRMHomePage extends BasePage {

    private final By linkWelcome = By.id("welcome");
    private final By linkLogout = By.xpath("//div[@id='welcome-menu']//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome() {
        click(linkWelcome, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {
        /*
        Way to avoid try/catch block, add to pom file an apache library
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        */

        click(linkLogout, WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginPage();
    }
}
