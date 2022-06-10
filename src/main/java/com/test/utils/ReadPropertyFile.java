package com.test.utils;

import com.test.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {

    private static final Properties property = new Properties();
    private static final Map<String, String> CONFIG_MAP = new HashMap<>();

    private ReadPropertyFile() {}

    static {
        try (FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath())) {

            property.load(file);

            //converting to HashMap
            for (Map.Entry<Object, Object> entry : property.entrySet()) {
                CONFIG_MAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
            }
            /*
            foreach with lambda expression
            property.entrySet().forEach(entry -> CONFIG_MAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //way of using HashMap to retrieve property
    public static String get(String key){
        if (Objects.isNull(key) || Objects.isNull(CONFIG_MAP.get(key))){
            throw new NullPointerException("Property name " + key + " is not found. Please check config.properties");
        }
        return CONFIG_MAP.get(key);
    }

    //way of using property directly
    public static String getValue(String key) {

        String value = property.getProperty(key);
        //Exception in case of no property value in property file and key is null
        if (Objects.isNull(value) || Objects.isNull(key)) throw new NullPointerException("Property name " + key + " is not found. Please check config.properties");
        return value;
    }
}
