package com.test.pages;

import com.test.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected void click(By by, String waitStrategy) {
        if (waitStrategy.equalsIgnoreCase("clickable")){
            explicitlyWaitForElementToBeClickable(by);
        }
        else if (waitStrategy.equalsIgnoreCase("present")){
            explicitlyWaitForElementToBeBePresent(by);
        }

        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendKeys(By by, String value, String waitStrategy){
        if (waitStrategy.equalsIgnoreCase("clickable")){
            explicitlyWaitForElementToBeClickable(by);
        }
        else if (waitStrategy.equalsIgnoreCase("present")){
            explicitlyWaitForElementToBeBePresent(by);
        }

        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

    private void explicitlyWaitForElementToBeClickable(By by){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(by));
//         .until(driver -> driver.findElement(by).isDisplayed()); old-fashioned way
    }

    private void explicitlyWaitForElementToBeBePresent(By by){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(by));
//         .until(driver -> driver.findElement(by).isDisplayed()); old-fashioned way
    }
}
