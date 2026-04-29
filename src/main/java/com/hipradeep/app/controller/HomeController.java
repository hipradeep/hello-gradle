package com.hipradeep.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hay")
    public String sayHay() {
        return "hay";
    }
}
