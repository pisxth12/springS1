package com.example.demo.abstracts;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    @GetMapping("cat")
    public String showCat(){
        Cat cat = new Cat("Srey Leak",19,"white");
        return cat.display();

    }
    @GetMapping("catSound")
    public String CatSound(){
        Cat cat = new Cat("Srey Leak",19,"white");
        return cat.makeSound();
    }
}
