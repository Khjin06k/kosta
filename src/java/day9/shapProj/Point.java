package java.day9.shapProj;

public class Point{ // 다른 클래스와 포함관계
    int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //포인터의 info를 만들어서 출력해도 됨
   /* public String info(){
        return "(" + x + ", "+ y +")";
    }*/
}
