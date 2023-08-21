package day7.chap6_OOP_1;

class TClass1{
    void method1(){
        int num1;
        method2(); // 같은 클래스 안에서 메서드를 가져올 때에는 레퍼런스 없이도 메서드끼리 서로 호출 가능
    }
    void method2(){
        int num2;
        method3();
    }
    void method3(){
        int num3;
    }
}
class TClass{
    void title(){
        System.out.println("-----");
        System.out.println("제목");
        boolean flag = false;
        if(flag == true) return;
    }
}
public class OOPTest7 {
    public static void main(String[] args) {
        TClass1 tc = new TClass1();
        tc.method1(); // method1과 같은 클래스가 아니기 때문에 지접 호출이 불가능
    }
}
