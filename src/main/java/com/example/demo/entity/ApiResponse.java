package com.example.demo.entity;


//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//public class ApiResponse <T>{
//    private Boolean success;
//    private String message;
//    private T data;
//}

import javax.xml.crypto.Data;

public class ApiResponse <T>{
    private boolean success;
    private String message;
    private T data;

    public ApiResponse(boolean success , String message, T data){
        this.success= success;
        this.message= message;
        this.data = data;
    }
    public ApiResponse(){}
    public boolean isSuccess(){
        return success;
    }
    public String getMessage(){
        return  message;
    }
    public T getData(){
        return data;
    }
    public void setSuccess(boolean success){
        this.success = success;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setData(T data){
        this.data = data;
    }

}
