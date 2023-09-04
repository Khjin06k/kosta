package a_java.day9.Test;

class AA{
    int a;
    void methodA(){} // 1
    void method(){} // 2
    void info(){
        System.out.println(getPay());
    }
    int getPay(){
        return 0;
    }
}

class BB extends AA{
    int b;
    void methodB(){} // 3
    void method(){} // 4

    @Override
    int getPay(){
        return 100;
    }
}

public class PolinoTest2 {
    public static void main(String[] args) {
        AA obj = new BB();
        obj.methodA(); // 1번 호출
        //obj.methodB(); // 부모 타입에 없는 메서드는 호출할 수 없음
        obj.method(); // 4번 호출 - 부모 타입에 있다고 하더라도 오버라이딩 된 자식 메서드가 있다면 자식의 메서드를 호출
        obj.a = 10;
        // obj.b = 10; // 부모에 없는 것은 호출이 안됨

        obj.info(); // 부모에 메서드가 존재하지만 getPay()의 경우 오버라이딩 된 메서드가 자식에 있기 때문에 자식 메서드를 호출함
    }
    // 자식 객체를 부모 변수에 넣을 경우, 부모에는 없는 자식의 변수나 함수는 사용할 수 없음
    // 단, 오버라이딩 한 함수는 부모 변수로 자식의 함수를 호출함
}
