package com.example.demo.Animal2;

abstract class Animal {
    protected String name;
    protected String gender;
    protected int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public abstract String makeSound();
}