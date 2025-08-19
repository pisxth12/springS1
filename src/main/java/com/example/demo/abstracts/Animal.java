package com.example.demo.abstracts;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract String makeSound();
//
//    public  String getName(){
//        return name;
//    }
//    public  int getAge(){
//        return age;
//    }

}
