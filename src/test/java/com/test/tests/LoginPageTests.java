package com.test.tests;

import com.test.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginPageTests extends BaseTest{

    private LoginPageTests() {}

    @Test
    public void test2(){
        Driver.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes", Keys.ENTER);
    }
}
