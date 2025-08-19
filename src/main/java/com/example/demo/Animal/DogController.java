package com.example.demo.Animal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {
    @GetMapping("/dog")
    public String showDog(){
        Dog dog = new Dog("kiki",5,"white");
        return dog.show();
    }
}
