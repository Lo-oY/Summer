package com.ly.core.web;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.Set;

/**
 * Created by cilu on 2017/11/21.
 */
@HandlesTypes(WebApplicationInitializer.class)
public class SummerServletContainerInitializer implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        if (c != null) {
            for (Class<?> init : c) {
                try {
                    if (!init.isInterface() && Modifier.isAbstract(init.getModifiers()) && WebApplicationInitializer.class.isAssignableFrom(init)) {
                        WebApplicationInitializer initializer = (WebApplicationInitializer) init.newInstance();
                        initializer.onStartUp(ctx);
                    }
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
