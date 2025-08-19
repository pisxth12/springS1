//package com.example.demo.entityV2;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class StudentV2 {
//    private long id;
//    private String firstName;
//    private String lastName;
//    private int age;
//    private String gender;
//}
package com.example.demo.entityV2;

public class StudentV2 {
    private String name;
    private int age;

    public StudentV2() {
    }

    public StudentV2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
