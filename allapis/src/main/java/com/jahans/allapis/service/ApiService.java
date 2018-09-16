package com.jahans.allapis.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ApiService {
    ApiParams apiParams;
    public ApiService() {

        this.apiParams = new ApiParams();

    }
    public String getApiVersion(){
        return this.apiParams.getVersion();
    }

    public int randomNumFunc() {
        Random rand = new Random();
        int n = rand.nextInt(1000000) + 1;
        return n;
    }

    public int totalRxCount(){
        return InterceptorMetrics.count;
    }
}
