package com.ly.core.web;

import com.ly.beans.BeanHelper;
import com.ly.core.web.servlet.ControllerHelper;
import com.ly.core.web.utils.ClassHelper;
import com.ly.core.web.utils.ClassUtils;
import com.ly.core.web.utils.IocHelper;

/**
 * Created by cilu on 2017/11/27.
 */
public final class SummerApplication {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> clazz : classList) {
            ClassUtils.loadClass(clazz.getName(), true);
        }
    }
}
