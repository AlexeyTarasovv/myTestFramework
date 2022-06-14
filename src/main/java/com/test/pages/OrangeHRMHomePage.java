package com.test.pages;

import com.test.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRMHomePage {

    private final By linkWelcome = By.id("welcome");
    private final By linkLogout = By.xpath("//div[@id='welcome-menu']//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome() {
        DriverManager.getDriver().findElement(linkWelcome).click();
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {
        /*
        Way to avoid try/catch block, add to pom file an apache library
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        */

        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5))
                .until(driver -> driver.findElement(linkLogout).isEnabled());
        DriverManager.getDriver().findElement(linkLogout).click();
        return new OrangeHRMLoginPage();
    }
}
