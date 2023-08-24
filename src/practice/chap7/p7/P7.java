package practice.chap7.p7;
// 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
class Parent {
    int x=100;
    Parent() {
        this(200);
    }
    Parent(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}
class Child extends Parent {
    int x = 3000;
    Child() {
        this(1000);
    }
    Child(int x) {
        this.x = x;
    }
}
public class P7 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x="+c.getX());
    }
    // 생성자 실행 순서
    // : Parent() >> Child() >> Child(int x) >> 실행
    // c.getX() 를 실행하므로 출력은 200이 나옴
}
