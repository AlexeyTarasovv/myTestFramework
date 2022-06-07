package com.test.tests;

import com.test.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{

    private HomePageTests() {}

    @Test
    public void test3(){
        Driver.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes", Keys.ENTER);
    }
}
