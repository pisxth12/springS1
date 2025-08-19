package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller  // <-- change this from @RestController
public class StudentsController {

    @GetMapping("/students")
    public String showForm(Model model) {
        model.addAttribute("student", new Student()); // empty Student object
        return "studentForm"; // HTML form view (studentForm.html in /templates)
    }

    @PostMapping("/students")
    public String submitForm(@ModelAttribute Student student, Model model) {
        System.out.println("Student name: " + student.getName());
        model.addAttribute("message", "Student saved successfully!");
        return "studentForm"; // back to form page
    }
}
