package com.test.tests;

import com.test.driver.Driver;
import com.test.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginPageTests extends BaseTest{

    private LoginPageTests() {}

    @Test
    public void test2(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes", Keys.ENTER);
    }

    @Test
    public void test3(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes", Keys.ENTER);
    }
}
