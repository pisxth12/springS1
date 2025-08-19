package com.example.demo;

public class People {
    protected int id;
    protected String name;
    protected String gender;
    public People(int id, String name, String gender) {
        this.id = id;
        this.name   = name;
        this.gender  = gender;
    }
    public People(){}
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public  void setGender(String gender){
        this.gender = gender;
    }
}
