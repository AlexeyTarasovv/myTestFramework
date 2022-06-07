package com.test.driver;

import com.test.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    private static WebDriver driver;

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return dr.get();
    }

    public static void setDriver(WebDriver driverref){
        dr.set(driverref);
    }

    public static void unload(){
        dr.remove();
    }

    public static void initDriver(){
        if(Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            driver = new ChromeDriver();

            setDriver(driver);
            getDriver().get("https://google.com");
        }
    }

    public static void quitDriver(){
        if (Objects.nonNull(driver)) {
            getDriver().quit();
            unload();
        }
    }
}
