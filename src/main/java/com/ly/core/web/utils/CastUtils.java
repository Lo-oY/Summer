package com.ly.core.web.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by cilu on 2017/11/22.
 */
public class CastUtils {

    private final Log log = LogFactory.getLog(getClass());

    public static String castString(Object object) {
        return castString(object, "");
    }

    public static String castString(Object object, String defaultValue) {

        return object != null ? String.valueOf(object) : defaultValue;
    }

    public static int castInt(Object object) {
        return castInt(object, 0);
    }

    public static int castInt(Object object, int defaultValue) {
        int intValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException ex) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    public static long castLong(Object object) {
        return castLong(object, 0);
    }

    public static long castLong(Object object, long defaultValue) {
        long longValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException ex) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    public static double castDouble(Object object) {
        return castDouble(object, 0);
    }

    public static double castDouble(Object object, double defaultValue) {
        double doubleValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException ex) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    public static boolean castBoolean(Object object) {
        return castBoolean(object, false);
    }

    public static boolean castBoolean(Object object, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (object != null) {
            booleanValue = Boolean.parseBoolean(castString(object));
        }
        return booleanValue;
    }
}
