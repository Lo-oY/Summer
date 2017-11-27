package com.ly.core.web;

import com.ly.core.web.utils.CastUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cilu on 2017/11/27.
 */
public class Param {

    private Map<String, Object> paramMap = new HashMap<String, Object>();

    public Param() {
    }

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public Map<String, Object> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtils.castLong(paramMap.get(name));
    }

    public int getInt(String name) {
        return CastUtils.castInt(paramMap.get(name));
    }

    public String getString(String name) {
        return CastUtils.castString(paramMap.get(name));
    }

    public double getDouble(String name) {
        return CastUtils.castDouble(paramMap.get(name));
    }

    public boolean getBoolean(String name) {
        return CastUtils.castBoolean(paramMap.get(name));
    }
}
