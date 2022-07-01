package com.test.reports;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getTest().pass(message);
    }

    public static void fail(String message){
        ExtentManager.getTest().pass(message);
    }

    public static void skip(String message){
        ExtentManager.getTest().skip(message);
    }
}
