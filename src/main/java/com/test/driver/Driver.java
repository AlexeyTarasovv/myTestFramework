package com.test.driver;

import com.test.constants.FrameworkConstants;
import com.test.PropertyUtils.ReadPropertyFile;
import com.test.enums.ConfigProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    private Driver() {}

    public static void initDriver() {
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverManager.chromedriver().setup();
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(ReadPropertyFile.get(ConfigProperties.URL));
        }
    }

    public static void quitDriver(){
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
