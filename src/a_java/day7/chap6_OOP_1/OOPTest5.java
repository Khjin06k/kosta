package a_java.day7.chap6_OOP_1;


class MyNumber{
    int num;
    void function(int n){
        int number = n;
        num = number;
    }
    void func2(int n){
        int number = n;
        num = number;
    }
}

class MyMath2{
    int x, y;
    int add(){
        return x+y;
    }
    int multi(){
        return x*y;
    }
}
public class OOPTest5 {
    public static void main(String[] args) {
        MyNumber mn = new MyNumber();
        System.out.println(mn.num); // 0 >> 0으로 자동 초기화
        mn.function(10);
        System.out.println(mn); // 10
        mn.func2(20);
        System.out.println(mn.num); //20

        MyMath2 mm = new MyMath2();
        mm.x = 10;
        mm.y = 20;
        System.out.println(mm.add());
        mm.x = 100;
        mm.y = 2;
        System.out.println(mm.multi());
    }
}
