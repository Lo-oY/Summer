package com.ly.core.web.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by cilu on 2017/11/22.
 */
public class ReflectUtils {

    private static final Log log = LogFactory.getLog(ReflectUtils.class);

    public static Object getInstance(Class<?> clzz) {

        Object instance = null;
        try {
            instance = clzz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static Object invokeMethod(Object object, Method method, Object... args) {
        Object result = null;
        try {
            method.setAccessible(true);
            result = method.invoke(object, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void setField(Object object, Field field, Object value) {
        try {
            field.setAccessible(true);
            field.set(object, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
