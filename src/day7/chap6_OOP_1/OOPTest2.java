package day7.chap6_OOP_1;

import javax.print.PrintService;

// Person 클래스 생성
class Person{
    String name;
    int age;

    String info(){ // method 정의
        return "이름 : " + name + ", 나이 : " + age;
    }
}

public class OOPTest2 {
    public static void main(String[] args) {
        Person per1 = new Person(); // 클래스 객체 생성
        per1.name = "김희진";
        per1.age = 23;

        System.out.println(per1.info()); // info() method 호출

        Person[] parr = new Person[5]; // Person을 배열로 생성 >> 레퍼런스 5개를 생성 (객체를 생성한 것이 아니며, 사용을 해야 한다면 각각의 객체를 생성해야 함)
        parr[0] = new Person();
        parr[1] = new Person();
        parr[2] = new Person();
        parr[3] = new Person();
        parr[4] = new Person();
    }
}
