package com.demo.timeline.controller;

//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MessageController {

    @RequestMapping(value = "/")
    public String index() {
//        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
//        System.out.println(username);
        return "index";

    }
}
