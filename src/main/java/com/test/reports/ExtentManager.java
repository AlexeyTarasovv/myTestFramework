package com.test.reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {

    private ExtentManager() {}

    private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();

    static ExtentTest getTest() {
        return extTest.get();
    }

    static void setTest(ExtentTest testRef){
        extTest.set(testRef);
    }

    static void unload(){
        extTest.remove();
    }
}
