package com.test.tests;

import com.test.driver.DriverManager;
import static org.assertj.core.api.Assertions.*;

import com.test.enums.WaitStrategy;
import com.test.pages.OrangeHRMHomePage;
import com.test.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTests extends BaseTest{

    private HomePageTests() {}

    @Test
    public void dashboardTextCheck(){
        new OrangeHRMLoginPage()
                .enterUserName("Admin").enterPassword("admin123").clickLogin();

        String dashboardString = new OrangeHRMHomePage().getDashboardDiv(WaitStrategy.PRESENCE).getText();
        Assertions.assertThat(dashboardString)
                .isEqualTo("Dashboard");
    }
}
