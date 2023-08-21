package day7.chap6_OOP_1;

// 지역변수는 메서드 영역에서 선언, 클래스 변수와 인스턴스 변수는 클래스 영역에서 선언
class MyClass{
    int num; // 인스턴스 변수 >> 인스턴스 생성 시 생성
    static int snum; // 클래스 변수 (static 변수, 공유 변수) >> 클래스가 메모리에 올라갈 때 생성

    void setNum(int n){ // 지역변수와 동일함 >> 호출되는 시점에 생성되었다가 사라지며, Stack 영역

    }
}
public class OOPTest4 {
    public static void main(String[] args) {

        // 자동 초기화 안됨
        // 메서드에서 생성된 변수 = 지역변수 >> Stack 영역에 생성 >> 호출되는 시점에 생성되었다가 사라짐 (변수 선언 수행 시)
        int n;

        // new에 의해 생성된 변수는 자동 초기화 됨
        // num 변수 생성 >> Heap 영역에 생성
        MyClass mc = new MyClass();
    }
}
