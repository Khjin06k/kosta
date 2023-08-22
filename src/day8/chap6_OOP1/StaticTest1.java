package day8.chap6_OOP1;

import javax.print.PrintService;

class Person{
    int age;
    String name;
}

class Number{
    int inum;
    static int snum;

    void imethod(){ // 인스턴스 메서드에서는 static 변수와 인스턴스 변수 모두 사용이 가능
        inum = 10;
        snum++;

        // 인스턴스 메서드에서는 인스턴스 메서드와 static 메서드 모두 호출 가능
        imethod2();
        smethod();
    }

    void imethod2(){

    }
    static void smethod(){ // static 메서드에서는 인스턴트 변수 사용 불가
        snum = 10;
       //inum++; >> 인스턴스 변수 사용 불가

        // static 메서드에서는 static 메서드만 호출 가능
        // imethod2(); >> 인스턴스 메서드 호출 불가
        smethod2();
    }

    static void smethod2(){

    }
}

public class StaticTest1 {
    public static void main(String[] args) {
        Person per = null;
        System.out.println(per.age); // 생성이 되지 않아서 에러 발생

        per = new Person();
        System.out.println(per.age); // 생성이 된 후이기 때문에 출력 가능


        // static 변수는 객체를 생성하지 않아도 접근 가능(프로그램 시작시 이미 변수가 생성되었기 때문)
        System.out.println(Number.snum);
        // System.out.println(Number.inum); // 인스턴스 변수는 객체 생성이 되어야 접근 가능

        Number n = new Number();
        System.out.println(n.inum); // 인스턴스 변수는 객체 생성이 되어야 접근 가능
        System.out.println(n.snum); // static 변수는 레퍼런스를 통해서도 접근 가능 (단, 클래스를 통해서 접근을 권장)


        Number.smethod(); // static 메서드는 객체 생성 없이 접근 가능
       // Number.imethod(); // 인스턴스 메서드는 객체 생성을 해야지만 접근 가능
        n.imethod();
        n.smethod(); // 객체를 통해서도 접근이 가능
    }
}
