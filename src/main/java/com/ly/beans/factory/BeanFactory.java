package com.ly.beans.factory;

/**
 * Created by cilu on 2017/10/31.
 */
public interface BeanFactory {

    Object getBean(String name);

    <T> T getBean(Class<T> requireType);

    boolean containBean(Object bean);
}
