package a_java.practice.chap6;
// 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스 메서드로 정의하시오.
class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1){
        return Math.sqrt(Math.pow(x-x1, 2)+Math.pow(y-y1, 2));
    }

    /*강사님 풀이
    double getDistance(MyPoint post){
            return Math.sqrt((pos.x-x)*(pos.x-x)+(pos.y-y)*(pos.y-y));
    }
    */
}

public class P7 {
    public static void main(String args[]) {
        MyPoint p = new MyPoint(1,1);
        // p(1,1)과 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));

        /* 강사님 풀이 - 생성자 배우기 전
        MyPoint p1 = new MyPoint();
        p1.x = 1;
        p1.y = 1;

        MyPoint p2 = new MyPoint();
        p2.x = 2;
        p2.y = 2;
         */
    }
}
