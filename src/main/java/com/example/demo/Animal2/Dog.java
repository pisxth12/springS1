package com.example.demo.Animal2;

public class Dog extends Animal {
    private String color;

    public Dog(String name , String gender , int age , String color){
        super(name, gender, age);
        this.color = color;
    }
   public String makeSound(){
       return "Woo woo 2";
   }
    public String Display() {
        return String.format(
                "<div>" +
                        "Name: %s<br>" +
                        "Gender: %s<br>" +
                        "Age: %d<br>" +
                        "MakeSound: %s" +
                        "</div>",
                this.name, this.gender, this.age, this.makeSound()
        );
    }


}
