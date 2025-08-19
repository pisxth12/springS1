package com.example.demo.entityV2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseV2<T> {
    private Boolean success;
    private String message;
    private T data;


}
