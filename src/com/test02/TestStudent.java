package com.test02;

import java.util.ArrayList;
import java.util.List;

class Human{
    String name;
    int age;
    int heigth;
    int weight;
    Human(){}
    Human(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.heigth = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + heigth + " " + weight;
    }
}
class Student extends Human{
    String number;
    String major;
    Student(String name, int age, int height, int weight, String number, String major){
        super(name, age, height, weight);
        this.number = number;
        this.major = major;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + heigth + " " + weight + " " + number + " " + major;
    }
}
public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        // Student 객체 3개 생성하여 list에 저장
        list.add(new Student("홍길동",20,177,74,"201301", "체육"));
        list.add(new Student("이순신", 44, 178, 77, "202302", "체육"));
        list.add(new Student("유관순", 18,155,45,"202303","컴퓨터"));

        // list에 저장된 Student 객체 정보 출력
        for(Student s : list){
            System.out.println(s);
        }
    }
}
