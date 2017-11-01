package com.ly.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * Created by cilu on 2017/10/26.
 */
public class BeanUtils {


    public static PropertyDescriptor[] getPropertyDescriptor(Class<?> clazz) {
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(clazz);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        assert beanInfo != null;
        return beanInfo.getPropertyDescriptors();

    }
}
