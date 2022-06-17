package com.test.factories;

import com.test.constants.FrameworkConstants;
import com.test.driver.DriverManager;
import com.test.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitFactory {

    private ExplicitWaitFactory(){}

    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by){

        WebElement element = null;

        if (waitStrategy == WaitStrategy.CLICKABLE){
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.elementToBeClickable(by));
        }
        else if (waitStrategy == WaitStrategy.PRESENCE){
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.presenceOfElementLocated(by));
//         .until(driver -> driver.findElement(by).isDisplayed()); old-fashioned way
        }
        else if(waitStrategy == WaitStrategy.VISIBLE){
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        else if(waitStrategy == WaitStrategy.NONE){
            element = DriverManager.getDriver().findElement(by);
        }
        return element;
    }

}
