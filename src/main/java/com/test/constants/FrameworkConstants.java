package com.test.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {}

    private static final String RESOURCES_PATH = System.getProperty("user.dir");
    private static final String CHROMEDRIVER_PATH = RESOURCES_PATH + "/src/test/resources/executables/chromedriver";
    private static final String CONFIG_FILE_PATH = RESOURCES_PATH + "/src/test/resources/config/config.properties";
    private static final String JSON_CONFIG_FILE_PATH = RESOURCES_PATH + "/src/test/resources/config/config.json";
    private static final int EXPLICIT_WAIT = 10;

    public static String getChromedriverpath() {
        return CHROMEDRIVER_PATH;
    }

    public static String getConfigfilepath() {
        return CONFIG_FILE_PATH;
    }

    public static String getJsonConfigFilePath() { return JSON_CONFIG_FILE_PATH; }

    public static int getExplicitWait() { return EXPLICIT_WAIT;}

}
