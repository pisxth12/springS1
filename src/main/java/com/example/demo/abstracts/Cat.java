package com.example.demo.abstracts;



public class Cat extends Animal{
    private String color;

    public Cat(String name , int age , String color){
        super(name,age);
        this.color = color;
    }



    @Override
    public String makeSound() {
        return "meov meow";
    }
    public String display(){
        return String.format(
                "<div class='result'>\n" +
                        "<h1>Name : %s</h1>\n" +
                        "<h1>Age : %d</h1>\n" +
                        "<h1>Color : %s</h1>\n" +
                        "<h1>Make Sound : %s</h1>\n" +
                        "</div>",
                this.name, this.age, this.color,this.makeSound()

                );
    }
}
