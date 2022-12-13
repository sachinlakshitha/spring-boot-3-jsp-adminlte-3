package com.sachinlakshitha.springboot3jspadminlte3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StarterController {
    @GetMapping("/")
    public String starter() {
        return "starter";
    }
}
