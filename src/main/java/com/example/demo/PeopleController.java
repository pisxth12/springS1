package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seth")

public class PeopleController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student(1,"Piseth","Male", 100 ,"A");
    }
}
