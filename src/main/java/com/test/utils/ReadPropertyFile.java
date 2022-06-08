package com.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    private ReadPropertyFile() {}

    public static String get(String key) throws IOException {
        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");

        property.load(file);
        return property.getProperty(key);
    }
}
