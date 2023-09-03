package java.day12.chap9_java_lang;
class Point implements Cloneable{ // clone 기능이 있는 것은 Cloneable 인터페이스를 구현한 클래스의 인스턴스만 복제할 수 있도록 함
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return x + ", " + y;
    }

    @Override
    public Object clone(){ // 가져다 쓰기 위해 public으로 접근 제어자 변경
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){ }
        return obj;
    }
}
public class CloneTest1 {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        Object obj = p.clone();
        Point cp = (Point)obj;
        System.out.println(p);
        System.out.println(cp);
    }
}
