package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Nir on 7/19/2017.
 */
@RestController
public class HelloController {


    @RequestMapping("hello")
    public String hello(HttpServletRequest req, HttpServletResponse res) {
        return "Hello!";
    }


}
