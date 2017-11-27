package com.ly.core.web.servlet;

import com.ly.core.web.annotation.RequestMapping;
import com.ly.core.web.utils.ClassHelper;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by cilu on 2017/11/27.
 */
public class ControllerHelper {

    private static final Map<Request, Handler> HANDLER_MAP = new HashMap<Request, Handler>();

    static {
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        for (Class<?> controllerClass : controllerClassSet) {
            Method[] methods = controllerClass.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(RequestMapping.class)) {
                    RequestMapping requestMapping = method.getDeclaredAnnotation(RequestMapping.class);
                    String mapping = requestMapping.value();
                    if (mapping.matches("\\w+:/\\w*")) {
                        String[] array = mapping.split(":");
                        if (ArrayUtils.isNotEmpty(array) && array.length == 2) {
                            String requestMethod = array[0];
                            String requestPath = array[1];
                            Request request = new Request(requestPath, requestMethod);
                            Handler handler = new Handler(controllerClass, method);
                            HANDLER_MAP.put(request, handler);
                        }
                    }
                }
            }
        }
    }


    public static Handler getHandler(String requestPath, String requestMethod) {
        Request request = new Request(requestPath, requestMethod);
        return HANDLER_MAP.get(request);
    }
}
