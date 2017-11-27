package com.ly.beans;

import com.ly.core.web.utils.ClassHelper;
import com.ly.core.web.utils.ReflectUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by cilu on 2017/11/24.
 */
public class BeanHelper {

    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> beanClass : beanClassSet) {
            Object object = ReflectUtils.getInstance(beanClass);
            BEAN_MAP.put(beanClass, object);
        }
    }

    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    public static Object getBean(Class<?> clzz) {

        if (!BEAN_MAP.containsKey(clzz)) {
            return new RuntimeException("can not get bean by class" + clzz);
        }
        return BEAN_MAP.get(clzz);
    }
}
