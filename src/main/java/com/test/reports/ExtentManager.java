package com.test.reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {

    private ExtentManager() {}

    private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return extTest.get();
    }

    public static void setTest(ExtentTest testRef){
        extTest.set(testRef);
    }

    public static void unload(){
        extTest.remove();
    }
}
