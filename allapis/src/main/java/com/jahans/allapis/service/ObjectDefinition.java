package com.jahans.allapis.service;

import java.security.SecureRandom;

public class ObjectDefinition {

    public String hostname;
    public String RAM;
    public String HDD;

    public ObjectDefinition() {

        hostname = this.randomString(8);
        RAM = "1024 MB";
        HDD = "1 TB";
    }


    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
}
