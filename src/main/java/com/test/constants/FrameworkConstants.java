package com.test.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {}

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver";
    private static final String URL = "https://google.com";

    public static String getChromedriverpath() {
        return CHROMEDRIVERPATH;
    }
}
