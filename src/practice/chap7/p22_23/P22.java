package practice.chap7.p22_23;

// 아래는 도형을 정의한 Shape클래스이다.
// 이 클래스를 조상으로 하는 Circle클래스와 Rectangle클래스를 작성하시오.
// 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야 한다.
// (1) 클래스명: Circle
// 조상클래스 : Shape
//멤버변수 : double r - 반지름
//(2) 클래스명: Rectangle
// 조상클래스 :Shape
//멤버변수 :int width - 폭 int height - 높이
//메서드 :
// 1. 메서드명: isSquare
// 기 능: 정사각형인지 아닌지를 알려준다.
// 반환타입: boolean
// 매개변수: 없음

import org.w3c.dom.css.Rect;

abstract class Shape {
    Point p; // 원과 사각형은 모두 Point를 사용하기 때문에 Shape에 Point를 넣음
    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape{
    double r;

    Circle(){}
    Circle(double r){
        this.r = r;
    }

    // 상속받은 부모 클래스의 메서드 오버라이딩
    @Override
    double calcArea() {
        return r*r*(Math.PI);
        // Math.PI에 있는 값으로 해야 정답과 동일하며,
        // 3.14로 계산할 경우 93.64로 값이 다르게 나옴
    }
}

class Rectangle extends Shape{
    int width;
    int height;
    Rectangle(){}
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    // 상속받은 부모 클래스의 메서드 오버라이딩
    @Override
    double calcArea() {
        return width*height;
    }

    // 정사각형인지 확인 여부 리턴
    boolean isSquare(){
        if(width == height) return true;
        return false;
    }
}

public class P22 {
    public static void main(String[] args) {

    }
}
