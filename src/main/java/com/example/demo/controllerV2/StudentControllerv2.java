package com.example.demo.controllerV2;

import com.example.demo.entityV2.ApiResponseV2;
import com.example.demo.entityV2.StudentV2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentControllerv2 {
    List<StudentV2> studentList = new ArrayList<>();
    @GetMapping("/get")
    public ResponseEntity<ApiResponseV2<List<StudentV2>>> getMessage() {
        return ResponseEntity.ok(
                new ApiResponseV2<>(
                        true,
                        "Fetched students successfully",
                         studentList
                )
        );
    }

    @PostMapping("/post")
   public ResponseEntity<ApiResponseV2<StudentV2>> createStudent(@RequestBody StudentV2 studentV2){

        if(studentV2.getAge()<=0 || studentV2.getAge()>=19){
            return ResponseEntity.ok(
                    new ApiResponseV2<>(
                            false,
                            "Old headass",
                            studentV2
                    )
            );
        }

        studentList.add(studentV2);
        return ResponseEntity.ok(
                new ApiResponseV2<>(
                        true,
                        "you're ok",
                        studentV2
                )
        );
    }
}

