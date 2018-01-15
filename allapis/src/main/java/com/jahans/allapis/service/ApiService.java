package com.jahans.allapis.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ApiService {
    ApiParams apiParams;
    public ApiService() {

        this.apiParams = new ApiParams();

    }

    public void rxCountInc(){
        this.apiParams.setRequestNum(this.apiParams.getRequestNum() + 1);
    }
    public String getApiVersion(){
        rxCountInc();
        return this.apiParams.getVersion();
    }

    public int randomNumFunc() {
        rxCountInc();
        Random rand = new Random();
        int n = rand.nextInt(1000000) + 1;
        return n;
    }

    public int totalRxCount(){
        return this.apiParams.requestNum;
    }
}
