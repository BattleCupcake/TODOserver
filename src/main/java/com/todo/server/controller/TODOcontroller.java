package com.todo.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class TODOcontroller {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getTodo() {
        return "TODO";
    }
}
