package com.jahans.allapis.service;

import org.springframework.web.bind.annotation.RequestMapping;


public class ApiController {
    private ApiService apiService;
    private ObjectService objectService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    public ApiController(ObjectService objectService) {
        this.objectService = objectService;
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

    @RequestMapping ("/runCommand")
    public String resultDocker(){

        return "works";
    }


}
