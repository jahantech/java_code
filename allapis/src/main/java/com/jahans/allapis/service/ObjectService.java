package com.jahans.allapis.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjectService {

    public List<ObjectDefinition> listOfComputers = new ArrayList<>();

    public ObjectService() {
    }


    public void createObject(){
        ObjectDefinition objectDefinition = new ObjectDefinition();
        listOfComputers.add(objectDefinition);
    }

    public List<ObjectDefinition> listObjects(){

        return this.listOfComputers;
    }
}
