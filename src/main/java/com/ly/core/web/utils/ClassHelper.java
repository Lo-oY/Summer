package com.ly.core.web.utils;

import com.ly.core.web.annotation.Bean;
import com.ly.core.web.annotation.Controller;
import com.ly.core.web.annotation.Service;
import com.ly.core.web.config.ConfigHelper;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cilu on 2017/11/22.
 */
public class ClassHelper {
    private static final Set<Class<?>> CLASS_SET;

    static {
        String backageName = ConfigHelper.getAppBase();
        CLASS_SET = ClassUtils.getClassSet(backageName);
    }

    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    public static Set<Class<?>> getServiceClassSet() {
        return getByAnnotation(Service.class);
    }


    public static Set<Class<?>> getControllerClassSet() {
        return getByAnnotation(Controller.class);

    }

    public static Set<Class<?>> getBeanClassSet() {
        return getByAnnotation(Bean.class);

    }

    private static Set<Class<?>> getByAnnotation(Class<? extends Annotation> annotation) {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> clzz : CLASS_SET) {
            if (clzz.isAnnotationPresent(annotation)) {
                classSet.add(clzz);
            }
        }
        return classSet;
    }

}
