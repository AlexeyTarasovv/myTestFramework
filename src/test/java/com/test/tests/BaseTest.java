package com.test.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.test.driver.Driver;
import com.test.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTest {

    protected BaseTest() {}

    @BeforeSuite
    public void beforeSuite(){
        ExtentReport.initReports();
    }

    @AfterSuite
    public void afterSuite() throws IOException {
        ExtentReport.flushReports();
    }

    @BeforeMethod
    protected void setUp() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    protected void tearDown() {
        Driver.quitDriver();
    }
}
