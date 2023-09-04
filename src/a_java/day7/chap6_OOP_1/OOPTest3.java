package a_java.day7.chap6_OOP_1;

class MyMath{
    int add(int x, int y){ // 입력해야 할 파라미터가 존재한다면 호출할 때에는 반드시 값을 넣어주어야 하고, 정의할 때에는 값의 타입을 지정
        int result = x+y;
        return result;
    }
}
public class OOPTest3 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        int res = mm.add(10, 20);
        System.out.println(res);
    }
}
