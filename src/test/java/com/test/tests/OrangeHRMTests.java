package com.test.tests;

import com.test.pages.OrangeHRMLoginPage;
import com.test.reports.ExtentReport;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test
    public void loginLogoutTest() {

        String title = new OrangeHRMLoginPage()
                .enterUserName("Admin").enterPassword("admin123").clickLogin()
                .clickWelcome().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");
    }
}
