package com.test.tests;

import com.test.driver.DriverManager;
import com.test.pages.OrangeHRMHomePage;
import com.test.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.time.Duration;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test
    public void loginLogoutTest() throws InterruptedException {

        String title = new OrangeHRMLoginPage()
                .enterUserName("Admin").enterPassword("admin123").clickLogin()
                .clickWelcome().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");
    }
}
