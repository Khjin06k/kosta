package day10;
class Base{
    void method(){
        System.out.println("Base method");
    }
}
class Derived extends Base{
    @Override
    void method() { // 오버라이딩 - 부모의 메서드를 수정(동일한 리턴타입, 동일한 이름)
        System.out.println("Derived mehtod");
    }
}

public class PolinoTest3 {
    public static void main(String[] args) {
        Base base1 = new Derived(); // 업캐스팅 - 자식 생성자를 부모 타입으로 받을 수 있음

        // 부모와 자식에 동일한 메서드가 존재할 때 부모의 것을 호출하는 것이 아닌 자식의 것을 호출
        // 단, 타입 자체는 부모의 것이기 때문에 오버라이딩이 불가능한 변수나 오버라이딩하지 않은 메서드의 경우에는 자식의 것은 호출할 수 없으며 부모의 것만 가져올 수 있음
        base1.method(); // "Derived method" 출력 >> 생상자가 자식이기 때문

        Base base2 = new Base();
        base2.method(); // "Base method" 출력 >> 생성자가 부모 자신
    }
}
