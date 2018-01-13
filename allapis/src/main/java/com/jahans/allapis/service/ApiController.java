package com.jahans.allapis.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/randomNumber")
    public int randomNumFunc(){

        return 2;
    }
}
