package com.test.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTests {

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
        driver.quit();
    }

    @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Testing mini bytes", Keys.ENTER);
        driver.quit();
    }
}
