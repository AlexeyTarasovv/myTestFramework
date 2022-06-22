package com.test.tests;

import com.test.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test(dataProvider = "LoginTestDataProvider")
    public void loginLogoutTest(String username, String password) throws InterruptedException {

        String title = new OrangeHRMLoginPage()
                .enterUserName(username).enterPassword(password).clickLogin()
                .clickWelcome().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");
    }

    @DataProvider(name="LoginTestDataProvider", parallel = true)
    public Object[][] getData(){
        return new Object[][] {
                {"Admin", "admin123"},
                {"Admin11111", "addddddd"}
        };
    }
}
