package com.example.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    /**
     * Controller method to open registration page
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registration() {
        return "register";
    }
}
