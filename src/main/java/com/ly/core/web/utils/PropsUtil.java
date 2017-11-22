package com.ly.core.web.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by cilu on 2017/11/22.
 */
public class PropsUtil {

    public static Properties loadProps(String fileName) {
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            PropsUtil.class.getResourceAsStream(ConfigConstant.CONFIG_FILE);
            if (inputStream == null)
                throw new FileNotFoundException(fileName + "file not found");
            properties = new Properties();
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getString(Properties properties, String key) {
        return getString(properties, key, "");
    }

    public static String getString(Properties properties, String key, String defaultValue) {
        String value = defaultValue;
        if (properties.contains(key))
            value = properties.getProperty(key);
        return value;
    }

    public static int getInt(Properties properties, String key) {
        return getInt(properties, key, 0);
    }

    public static int getInt(Properties properties, String key, int defaultValue) {
        int value = defaultValue;
        if (properties.contains(key))
            value = CastUtils.castInt(properties.getProperty(key));
        return value;
    }

    public static boolean getBoolean(Properties properties, String key) {
        return getBoolean(properties, key, false);
    }

    public static boolean getBoolean(Properties properties, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (properties.contains(key))
            value = CastUtils.castBoolean(properties.getProperty(key));
        return value;
    }


}
