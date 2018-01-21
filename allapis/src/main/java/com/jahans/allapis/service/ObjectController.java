package com.jahans.allapis.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ObjectController {
    private ApiService apiService;
    private ObjectService objectService;


    public ObjectController(ObjectService objectService) {
        this.objectService = objectService;
    }

   
    @RequestMapping ("/createObject")
    public String createObjects(){
        this.objectService.createObject();
        return "Object Created!";
    }

    @RequestMapping ("/listObjects")
    public List<ObjectDefinition> listObjects(){

        return this.objectService.listObjects();
    }

    @RequestMapping ("/deleteObjects")
    public String deleteObjects(){

        return "Deleted Object!";
    }
}
