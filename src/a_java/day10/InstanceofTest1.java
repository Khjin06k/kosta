package a_java.day10;

public class InstanceofTest1 {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Derived();

        if(b1 instanceof Base){ // 출력
            System.out.println("b1 is Base instance");
        }
        if(b1 instanceof Derived){ // 출력 안됨 >> 다운캐스팅 불가능
            System.out.println("b1 is Derived instance");
        }
        if(b2 instanceof Base){ // 출력 >> 자식은 부모의 객체이기도 하기 때문에 다운 캐스팅 가능
            System.out.println("b2 is Base instance");
        }
        if(b2 instanceof Derived){ // 출력
            System.out.println("b2 is Derived instance");
        }
    }
}
