package com.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {

    private ReadPropertyFile() {}

    public static String get(String key) throws IOException {
        String value = "";

        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");

        property.load(file);
        value = property.getProperty(key);
        //Exception in case of no property value in property file
        if (Objects.isNull(value)) throw new NullPointerException("Property name " + key + " is not found. Please check config.properties");
        return value;
    }
}
