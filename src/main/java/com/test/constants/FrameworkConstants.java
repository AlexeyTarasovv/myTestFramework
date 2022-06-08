package com.test.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {}

    private static final String RESOURCESPATH = System.getProperty("user.dir");
    private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/src/test/resources/executables/chromedriver";
    private static final String CONFIGFILEPATH = RESOURCESPATH + "/src/test/resources/config/config.properties";

    public static String getChromedriverpath() {
        return CHROMEDRIVERPATH;
    }

    public static String getConfigfilepath() {
        return CONFIGFILEPATH;
    }
}
