package day10;
class Base{
    int x;
    void method(){
        System.out.println("Base method");
    }
}
class Derived extends Base{
    int y;
    @Override
    void method() { // 오버라이딩 - 부모의 메서드를 수정(동일한 리턴타입, 동일한 이름)
        System.out.println("Derived mehtod");
    }
}

public class PolinoTest3 {
    public static void main(String[] args) {
        Base base1 = new Derived(); // 업캐스팅 - 자식 생성자를 부모 타입으로 받을 수 있음

        // 부모와 자식에 동일한 메서드가 존재할 때 부모의 것을 호출하는 것이 아닌 자식의 것을 호출
        // 단, 타입 자체는 부모의 것이기 때문에 오버라이딩이 불가능한 변수나 오버라이딩하지 않은 메서명의 경우에는 자식의 것은 호출할 수 없으며 부모의 것만 가져올 수 있음
        base1.method(); // "Derived method" 출력 >> 생상자가 자식이기 때문
        base1.x = 10;
        // base1.y = 10; // 불가능

        Base base2 = new Base();
        base2.method(); // "Base method" 출력 >> 생성자가 부모 자신


        if(base1 instanceof Derived){ // 앞에 있는 레퍼런스 변수가 뒤의 클래스의 인스턴스인지를 물어보는 것
            // base1이 Derived의 생성자이기 때문에 true
            // base2는 Base의 생성자이기 때문에 false
            // 다운캐스팅
            Derived derived1 = (Derived) base1; // Base 타입에 담았던 base1을 강제로 자식 타입에 담기 위해 다운캐스팅 진행
            derived1.y= 20;
        }

        if(base2 instanceof Derived){
            // 다운캐스팅 불가능 >> 에러 발생 >> 이를 방지하기 위해 instanceof로 가능 여부를 확인
            Derived derived2 = (Derived) base2; // 자식 객체를 생성한 것의 주소를 가지고 있는 것이 아닌 부모 객체를 생성한 것의 주소를 가지고 있기 때문에 에러는 안나지만 문제가 발생함
            derived2.y = 30;
        }
    }
}
