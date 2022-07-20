package com.test.pages;

import com.test.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class GoToMenu extends BasePage {
    private final By linkDashboard = By.xpath("//b[text()='Dashboard']/parent::a");
    private final By linkDirectory = By.xpath("//b[text()='Directory']/parent::a");

    public OrangeHRMHomePage clickDashboard() {
        click(linkDashboard, WaitStrategy.CLICKABLE, "DashboardLink");
        return new OrangeHRMHomePage();
    }

    public void clickDirectory() {
        click(linkDirectory, WaitStrategy.CLICKABLE, "DirectoryLink");
    }
}
