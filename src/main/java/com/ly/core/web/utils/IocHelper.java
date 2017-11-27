package com.ly.core.web.utils;

import com.ly.beans.BeanHelper;
import com.ly.core.web.annotation.Inject;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by cilu on 2017/11/24.
 */
public class IocHelper {

    static {
        Map<Class<?>, Object> bean = BeanHelper.getBeanMap();
        if (!bean.isEmpty()) {
            for (Map.Entry<Class<?>, Object> entry : bean.entrySet()) {
                Class<?> key = entry.getKey();
                Object value = entry.getValue();
                Field[] fields = key.getFields();
                if (!ArrayUtils.isEmpty(fields)) {
                    for (Field field : fields) {
                        if (field.isAnnotationPresent(Inject.class)) {
                            Class<?> type = field.getType();
                            Object beanFieldInstance = bean.get(type);
                            if (beanFieldInstance != null) {
                                ReflectUtils.setField(key, field, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
