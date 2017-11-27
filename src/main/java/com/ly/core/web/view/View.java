package com.ly.core.web.view;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cilu on 2017/11/27.
 */
public class View {

    private String path;
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        this.model = new HashMap<String, Object>();
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public View addModel(String key, Object value) {
        this.model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

}
