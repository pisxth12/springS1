package com.example.demo.Animal;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age=age;
    }
    public abstract String makeSound();
}
