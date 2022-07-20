package com.test.tests;

import com.test.pages.TabWebControl;
import com.test.pages.OrangeHRMLoginPage;
import org.testng.annotations.Test;

public class GoToMenuTest extends BaseTest{

    private GoToMenuTest(){}

    @Test
    public void goToMenuTest() throws InterruptedException {
        new OrangeHRMLoginPage()
                .enterUserName("Admin").enterPassword("admin123").clickLogin();

        new TabWebControl().clickDashboard();

        Thread.sleep(1000);
        new TabWebControl().clickDirectory();

        new TabWebControl().hoverOverMaintenance();
    }

}
