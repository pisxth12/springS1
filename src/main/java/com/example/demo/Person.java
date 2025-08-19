package com.example.demo;

public class Person {
    private int id;
    private String name;
    private String gender;
    private Float salary;

    Person(int id, String name, String gender, Float salary) {
        this.id   = id;
        this.name   = name;
        this.gender  = gender;
        this.salary  = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Float getSalary() {
        return salary;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }


}
