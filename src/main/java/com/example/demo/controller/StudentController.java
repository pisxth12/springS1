package com.example.demo.controller;


import com.example.demo.entity.ApiResponse;
import com.example.demo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> studentList = new ArrayList<>();

    @GetMapping("/student")
    public ResponseEntity<ApiResponse<List<Student>>> getMessage() {
        return ResponseEntity.ok(
            new ApiResponse<>(
                    true,
                    "Student create successfully",
                    studentList
                 )

        );
    }




    @PostMapping("/submit")
    public ResponseEntity<ApiResponse<Student>> createStudet(@RequestBody Student student) {
        if (student.getAge() <= 4 || student.getAge() >= 18) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ApiResponse<>(
                            false,
                            "Invalid age",
                            student
                    )
            );
        }
        studentList.add(student);
        return ResponseEntity.ok(
                new ApiResponse<>(
                        true,
                        "Student create success",
                        student
                )
        );
    }
}



