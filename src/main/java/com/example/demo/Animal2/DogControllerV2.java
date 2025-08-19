package com.example.demo.Animal2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class DogControllerV2 {
    @GetMapping("/dogs")
    public String ShowDog() {
        Dog dog = new Dog("mm","femal",12,"red");
        return dog.Display();
    }
}
