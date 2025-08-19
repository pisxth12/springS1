package com.example.demo;

public class Student extends People {
    private int score;
    private String grade;

    public Student(){}

    public Student(int id, String name , String gender , int score , String grade){
        super(id, name, gender);
        this.score = score;
        this.grade = grade;
    }


    public int getScore(int score) {
        return score;
    }
    public void setScore(){
        this.score = score;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(){
        this.grade = grade;
    }
}
