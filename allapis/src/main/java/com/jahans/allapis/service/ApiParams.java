package com.jahans.allapis.service;

public class ApiParams {

    public int requestNum = 0;
    public  String version="1.0";

    public String dockerImage;
    public String dockerImageVersion;
    public String[] dockerCommands;

    public int getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(int requestNum) {
        this.requestNum = requestNum;
    }

    public String getVersion() {
        return version;
    }


}
