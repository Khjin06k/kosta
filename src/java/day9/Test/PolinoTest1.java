package java.day9.Test;
class Shape{
    String color;
    void draw(){
        System.out.println("shape");
    }
}
class Circle extends Shape{
    int x;
    int y;
    int r;

    @Override
    void draw(){
        System.out.println("circle");
    }
}
public class PolinoTest1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.color = "green";
        c.r = 20;
        c.y = 10;
        c.draw(); // "circle" 값이 출력

        Shape s = new Circle(); // upCasting - 자식 객체를 부모 레퍼런스에 넣을 수 있음
        s.color = "red";
        // s.x = 10; - 부모타입의 정보만 사용함

        s.draw();
        // 타입은 Shape,  생성자는 Circle, 변수는 부모 타입의 정보만 사용한다고 하더라도
        // >> 실제 new한 자식이 오버라이딩 했다면 자식 것을 호출
        // >> 따라서 "circle"을 출력
        // 다형성 상속, 업캐스팅, 오버라이딩이 된 메서드는 자식 객체를 부모 타입의 변수로 호출 시 자식의 메서드가 실행
    }
}
