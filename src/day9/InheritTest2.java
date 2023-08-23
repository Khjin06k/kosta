package day9;

class Base{
    int bnum;
    void method1(){} // 1
    void method2(){} // 2

}

class Derived extends Base{
    int dnum;
    void method1(int n){} // 6
    //void method2(){} // 3
    void method2(){
        method1(); // 가능
        super.method2(); // super가 없으면 자기 자신을 계속 호출하기 때문에 super을 통해 부모의 메서드를 가져와야 허ㅏㅁ
        //method2(); // 잘못 사용될 확률이 매우 높음
    }
    void method2(int n){} // 5
    void method3(){} // 4
}

public class InheritTest2 {
    public static void main(String[] args) {
        Base b = new Base();
        b.bnum = 10;
        b.method1(); // 1
        b.method2(); // 2

        Derived d = new Derived();
        d.bnum = 20;
        d.dnum = 30;
        d.method1(); // 1
        d.method2(); // 3 - d에 method2가 있는 경우 d의 것이 호출
        d.method3(); // 4
        d.method2(); // 2 - d에 method2가 없고 method2(int n)만 있는 경우 부모의 것이 호출
        d.method1(); // 1
        d.method1(d.bnum); // 6
    }
}
