package com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nir on 7/16/2017.
 */
@RestController
public class exampleController {


    @RequestMapping(value = "/withBasicHttp", method = RequestMethod.POST)
    public String helloWithBasicHttp(){
        return "hello with basic http";
    }

    @RequestMapping(value = "/withoutBasicHttp", method = RequestMethod.POST)
    public String helloWithoutBasicHttp(){
        return "hello without basic http";
    }
}
