package day9.shapProj;

public class Triangle extends Shape{
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point(); // 삼각형의 세 점

    // 게터 세터 생성
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    // 생성자 생성
    public Triangle(){}

    public Triangle(String color, Point p1, Point p2, Point p3){
        super(color);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle(String color, int x1, int y1, int x2, int y2, int x3, int y3){
        super(color);
        this.p1.x = x1;
        this.p1.y = y1;
        this.p2.x = x2;
        this.p2.y = y2;
        this.p3.x = x3;
        this.p3.y = y3;
    }

    // info 출력
    public String info(){
        return "[삼각형 : " + super.info()+String.format("점1(%d, %d), 점2(%d, %d), 점3(%d, %d)]", getP1().x, getP1().y, getP2().x, getP2().y, getP3().x, getP3().y);
    }

}
