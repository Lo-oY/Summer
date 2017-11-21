package com.ly.core.web;

import javax.servlet.ServletContext;

/**
 * Created by cilu on 2017/11/21.
 */
public interface WebApplicationInitializer {
    void onStartUp(ServletContext servletContext);
}
