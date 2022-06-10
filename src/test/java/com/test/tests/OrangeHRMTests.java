package com.test.tests;

import com.test.driver.DriverManager;
import com.test.pages.OrangeHRMHomePage;
import com.test.pages.OrangeHRMLoginPage;
import org.testng.annotations.Test;

import java.time.Duration;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test
    public void loginLogoutTest() throws InterruptedException {


        OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
        OrangeHRMHomePage ohhp = ohlp.enterUserName("Admin").enterPassword("admin123").clickLogin();

        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ohhp.clickWelcome().clickLogout();
    }
}
