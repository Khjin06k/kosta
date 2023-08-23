package day9.shapProj;

public class Rectangle extends Shape{
    Point startPos = new Point(); // 사각형 시작 위
    int width, height; // 가로, 세로

    // 게터 세터 생성
    public Point getStartPos() {
        return startPos;
    }

    public void setStartPos(Point startPos) {
        this.startPos = startPos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // 생성자 생성
    public Rectangle(){}
    public Rectangle(String color, int x1, int y1, int width, int height){
        super(color);
        this.startPos.x = x1;
        this.startPos.y = y1;
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, Point startPos, int width, int height){
        super(color);
        this.startPos = startPos;
        this.width = width;
        this.height = height;
    }

    // info 출력
    public String info(){
        return "[사각형 : " + super.info()+String.format("시작점(%d, %d), 너비(%d), 높이(%d)]", getStartPos().x, getStartPos().y, getWidth(), getHeight());
    }
}
