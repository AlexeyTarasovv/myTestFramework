package com.test.driver;

import com.test.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    private static WebDriver driver;

    public static void initDriver(){
        if(Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            driver = new ChromeDriver();

            DriverManager.setDriver(driver);
            DriverManager.getDriver().get("https://google.com");
        }
    }

    public static void quitDriver(){
        if (Objects.nonNull(driver)) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
