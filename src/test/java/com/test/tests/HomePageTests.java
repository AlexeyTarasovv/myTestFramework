package com.test.tests;

import com.test.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomePageTests extends BaseTest{

    private HomePageTests() {}

    @Test
    public void test3(){
        WebDriver driver = DriverManager.getDriver();

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("QA Testing", Keys.ENTER);

        //QA Testing - Search results - Wikipedia

        String title = driver.getTitle();
        Assert.assertTrue(Objects.nonNull(title), "Title is null");
        Assert.assertTrue(title.toLowerCase().contains("wikipedia"));
        Assert.assertTrue(title.length() > 15 && title.length() < 100);

        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='mw-search-results']/li/div/a"));
        Assert.assertEquals(links.size(), 20);

        boolean isElementPresent = false;
        for (WebElement e : links) {
            if (e.getText().equalsIgnoreCase("game testing")){
                isElementPresent = true;
                break;
            }
        }
        Assert.assertTrue(isElementPresent, "Expected link not found");
    }
}
