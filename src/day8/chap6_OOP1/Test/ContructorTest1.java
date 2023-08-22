package day8.chap6_OOP1.Test;


class Person1{
    int age;
    String name;

    // 생성자는 클래스에 하나 이상 있어야 하며, 없을 경우 기본생성자가 자동으로 생성됨
    // 생성자도 오버로딩이 가능함
    Person1(){
       // System.out.println("Person()");
        // 기본 생성자는 0, null  등으로 초기와가 되는데 기본 생성자 생성을 변경할 수 있음
        this("none", 0); // 생성자에서 다른 생성자를 호출 >> String, int 매개변수이므로 Person(String n, int a)를 불러옴
        /*age = 0;
        name = "none";*/
    } // 기본 생성자, 생성자는 리턴타입이 없으며, void가 생략

    Person1(String n, int a){ // 생성자가 있다면 기본생성자가 자동생성되지 않아서 위처럼 생성을 해줘야 함
        age = a;
        name = n;
    }

    Person1(String n){
        this(n, 0); // 생성자에서 다른 생성자를 호출 >> String, int 매개변수이므로 Person(String n, int a)를 불러옴
        System.out.println(n); // 생성자에서 생성자를 호출할 때에는 this()가 맨 앞에 와야 하기 때문에 그 외의 코드는 모두 this() 뒤에 와야 함
        /*name = n;
        age = 0;*/
    }

    Person1(int a){
        this("none", a); // 생성자에서 다른 생성자를 호출 >> String, int 매개변수이므로 Person(String n, int a)를 불러옴
        /*age = a;
        name = "none";*/
    }

    Person1(Person1 p){}

    /*String info(Person1 this){
        return "이름 : " + this.name + ", 나이 : " + this.age;
    }*/
}
public class ContructorTest1 {
    public static void main(String[] args) {
        Person1 per1 = new Person1();
        per1.age = 30;
        per1.name = "고길동";

        Person1 per2 = new Person1("홍길동", 20); // 생성과 동시에 초기화 진행

        Person1 per3 = new Person1("차길동");

        Person1 per4 = new Person1(40);

        Person1 per5 = new Person1(per1); // Person을 매개변수로 가지는 생성자도 생성 가능

        //per1.info(); // Person.info(per1) 으로 호출 >>
    }
}
