package com.example.demo.Animal;

public class Dog extends Animal {
    private String color;

    public Dog(String name , int age , String color){
        super(name,age);
        this.color = color;
    }
    public String makeSound(){
        return "Nigga";
    }
    public String show(){
        return String.format(
                "<div>" +
                        "Name: %s" +"\n||"+
                        "Age: %d" +"\n||"+
                        "Color: %s"+"\n||"+
                        "MakeSound: %s" +"\n||"+
             "</div>",
        this.name,this.age,this.color,this.makeSound()
        );
    }

}
