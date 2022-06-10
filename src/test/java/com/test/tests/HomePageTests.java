package com.test.tests;

import com.test.driver.DriverManager;
import static org.assertj.core.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTests extends BaseTest{

    private HomePageTests() {}

    @Test
    public void test3(){
        WebDriver driver = DriverManager.getDriver();

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("QA Testing", Keys.ENTER);

        //QA Testing - Search results - Wikipedia
        String title = driver.getTitle();
        assertThat(title)
                .as("Object is actually null").isNotNull()
                .containsIgnoringCase("wikipedia")
                .as("Doesn't have size between 15 and 100").hasSizeBetween(15, 100);


        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='mw-search-results']/li/div/a"));

        assertThat(links)
                .hasSize(20)
                .extracting(e -> e.getText().toLowerCase())
                .contains("game testing");
    }
}
