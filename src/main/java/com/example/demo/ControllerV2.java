package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Utils.baseUrl+"/v2")
public class ControllerV2 {
    @GetMapping("/home")
    public User home(){
        return new User("Sorn Piseth",21);
    }


    @PostMapping("submit")
    public User submit(@RequestBody User user) {
        return user;
    }

}
