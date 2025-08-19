package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Utils.baseUrl+"/v4")
public class ControllerV4 {
    @GetMapping("/home")
    public User home(){
        return new User("Samang" ,31);
    }

    @PostMapping("/submit")
    public User submit(User user){
        return user;
    }
}
