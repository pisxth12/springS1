package com.example.demo;

public class User {
    private String name;
    private int age;

    // Constructor with parameters
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public User() {
    }

    // Setter & Getter for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Setter & Getter for age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
