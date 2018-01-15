package com.jahans.allapis.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @RequestMapping ("/random")
    public int randomFuncServiceMethod(){
        return apiService.randomNumFunc();
    }

    @RequestMapping ("/version")
    public String getVersionFuncServiceMethod(){
        return this.apiService.getApiVersion();
    }

    @RequestMapping ("/count")
    public int getRxCount(){
        return this.apiService.totalRxCount();
    }
}
