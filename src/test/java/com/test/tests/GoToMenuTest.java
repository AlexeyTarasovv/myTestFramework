package com.test.tests;

import com.test.enums.WaitStrategy;
import com.test.pages.GoToMenu;
import com.test.pages.OrangeHRMHomePage;
import com.test.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GoToMenuTest extends BaseTest{

    private GoToMenuTest(){}

    @Test
    public void goToMenuTest() throws InterruptedException {
        new OrangeHRMLoginPage()
                .enterUserName("Admin").enterPassword("admin123").clickLogin();

        new GoToMenu().clickDashboard();

        Thread.sleep(1000);
        new GoToMenu().clickDirectory();
    }

}
