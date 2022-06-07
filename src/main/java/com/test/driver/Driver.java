package com.test.driver;

import com.test.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;

    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    public static void quitDriver(){
        driver.quit();
    }
}
