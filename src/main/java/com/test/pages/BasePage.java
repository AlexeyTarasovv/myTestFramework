package com.test.pages;

import com.test.driver.DriverManager;
import com.test.enums.WaitStrategy;
import com.test.factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected void click(By by, WaitStrategy waitStrategy) {

        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.click();
    }

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy){

        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.sendKeys(value);
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
}
