package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Utils.baseUrl+"/v3")
public class ControllerV3 {
    @GetMapping("/home")
    public User home() {
        return new User("Samang sorn",31);
    }
    @PostMapping("/submit")
    public User submit(@RequestBody User user) {
        return user;
    }
}
