package com.jahans.allapis.service;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterceptorMetrics extends HandlerInterceptorAdapter {
    private static Object lock = new Object();
    public static int count =  0;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException {
        synchronized(lock){
            count++;
        }

        return true;
    }

}