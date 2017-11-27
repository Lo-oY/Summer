package com.ly.core.web.servlet;

/**
 * Created by cilu on 2017/11/27.
 */
public class Request {
    private String requestPath;
    private String requestMethod;

    public Request() {
    }

    public Request(String requestPath, String requestMethod) {
        this.requestPath = requestPath;
        this.requestMethod = requestMethod;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }
}
