package com.chunjae.test05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCtrl {

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }
}
