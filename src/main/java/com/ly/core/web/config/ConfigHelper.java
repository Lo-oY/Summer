package com.ly.core.web.config;

import com.ly.core.web.utils.ConfigConstant;
import com.ly.core.web.utils.PropsUtil;

import java.util.Properties;

/**
 * Created by cilu on 2017/11/22.
 */
public class ConfigHelper {
    private static final Properties properties = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    public static String getJdbcUrl() {
        return PropsUtil.getString(properties, ConfigConstant.JDBC_URL);
    }

    public static String getJdbcUserName() {
        return PropsUtil.getString(properties, ConfigConstant.JDBC_USERNAME);
    }

    public static String getJdbcPassword() {
        return PropsUtil.getString(properties, ConfigConstant.JDBC_PASSWORD);
    }

    public static String getAppBase() {
        return PropsUtil.getString(properties, ConfigConstant.APP_BASE_PACKAGE);
    }

    public static String getAssetPath() {
        return PropsUtil.getString(properties, ConfigConstant.APP_ASSET_PATH, "/asset/");
    }

    public static String getJspPath() {
        return PropsUtil.getString(properties, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }
}
