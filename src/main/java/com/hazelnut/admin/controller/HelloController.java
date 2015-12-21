package com.hazelnut.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiachiliu on 12/21/15.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        return "Hello admin";
    }
}
