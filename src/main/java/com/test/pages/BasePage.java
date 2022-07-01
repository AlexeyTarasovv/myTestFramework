package com.test.pages;

import com.test.driver.DriverManager;
import com.test.enums.WaitStrategy;
import com.test.factories.ExplicitWaitFactory;
import com.test.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected void click(By by, WaitStrategy waitStrategy, String elementName) {

        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.click();
        ExtentLogger.pass(elementName + " is clicked");
    }

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy, String elementName){

        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.sendKeys(value);
        ExtentLogger.pass(value + " is entered successfully in " + elementName);
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
}
