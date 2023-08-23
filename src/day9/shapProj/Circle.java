package day9.shapProj;

public class Circle extends Shape{
    Point center = new Point(); // 원의 중점
    int radius; // 반지름

    // 게터 세터 생성
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // 생성자 생성
    public Circle(){}
    public Circle(String color, int x1, int y1, int radius){
        super(color);
        this.center.x = x1;
        this.center.y = y1;
        this.radius = radius;

    }
    public Circle(String color, Point center, int radius){
        super(color);
        this.center = center;
        this.radius = radius;
    }

    // info 출력
    public String info(){
        return "[원 : " + super.info()+String.format("중심점(%d, %d), 반지름(%d)]", getCenter().x, getCenter().y, getRadius());
    }
}
