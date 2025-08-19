package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Utils.baseUrl+"/v1")
public class Controller {
    @GetMapping("/home")
    public String home() {
        return "Welcom to home page";
    }
    @GetMapping("/about")
    public String about() {
        return "Welcom to about page";
    }
}
