package com.ly.core.web.servlet;

import java.lang.reflect.Method;

/**
 * Created by cilu on 2017/11/27.
 */
public class Handler {
    private Class<?> controllerClass;
    private Method actionMethod;

    public Handler() {
    }

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Method getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(Method actionMethod) {
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public void setControllerClass(Class<?> controllerClass) {
        this.controllerClass = controllerClass;
    }
}
