package com.test.pages;

import com.test.enums.WaitStrategy;
import com.test.factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public final class OrangeHRMHomePage extends BasePage {

    private final By linkWelcome = By.id("welcome");
    private final By linkLogout = By.xpath("//div[@id='welcome-menu']//a[text()='Logout']");
    private final By h1Dashboard = By.xpath("//div/h1[text()='Dashboard']");
    private final By quickLaungeImages = By.xpath("//div[@class='quickLaunge']//img");
    private final By quickLaungeTexts = By.xpath("//div[@class='quickLaunge']//span");

    public OrangeHRMHomePage clickWelcome() {
        click(linkWelcome, WaitStrategy.PRESENCE, "Welcome link");
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {
        /*
        Way to avoid try/catch block, add to pom file an apache library
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        */

        click(linkLogout, WaitStrategy.CLICKABLE, "Logout button");
        return new OrangeHRMLoginPage();
    }

    public WebElement getDashboardDiv(WaitStrategy waitStrategy) {
        return ExplicitWaitFactory.performExplicitWait(waitStrategy, h1Dashboard);
    }

//    public ArrayList<WebElement> getQuickLauchImages(WaitStrategy waitStrategy) {
//
//        ArrayList<WebElement> elements = new ArrayList<>()
//        return ExplicitWaitFactory.performExplicitWait(waitStrategy, quickLaungeImages);
//    }
}
