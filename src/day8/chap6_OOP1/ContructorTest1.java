package day8.chap6_OOP1;


class Person1{
    int age;
    String name;

    // 생성자는 클래스에 하나 이상 있어야 하며, 없을 경우 기본생성자가 자동으로 생성됨
    // 생성자도 오버로딩이 가능함
    Person1(){
       // System.out.println("Person()");
    } // 기본 생성자, 생성자는 리턴타입이 없으며, void가 생략

    Person1(String n, int a){ // 생성자가 있다면 기본생성자가 자동생성되지 않아서 위처럼 생성을 해줘야 함
        age = a;
        name = n;
    }

    Person1(String n){
        name = n;
    }

    Person1(int a){
        age = a;
    }
}
public class ContructorTest1 {
    public static void main(String[] args) {
        Person1 per1 = new Person1();
        per1.age = 30;
        per1.name = "고길동";

        Person1 per2 = new Person1("홍길동", 20); // 생성과 동시에 초기화 진행

        Person1 per3 = new Person1("차길동");

        Person1 per4 = new Person1(40);
    }
}
