package com.jahans.allapis.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ApiController {

    @RequestMapping("/randomNumber")
    public int randomNumFunc(){


        Random rand = new Random();

        int  n = rand.nextInt(1000000) + 1;

        return n;
    }
}
