package practice.chap7.p7;
// 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
class Parent {
    int x=100;
    Parent() {
        this(200); // Parent(int x)를 호출하기 때문에 x = 200으로 변경
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
    Child() { // 기본 생성자 호출 시 부모의 기본 생성자 호출됨 >> Child()보다 먼저 Parent가 먼저 생성
        this(1000); // Child(int x) 를 호출하여 x = 1000으로 변경
    }
    Child(int x) {
        this.x = x;
    }
}
public class P7 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x="+c.getX());
        // c.getX() - c는 Child, getX()는 Parent 메서드,
        // 오버라이드 되지 않기 때문에 부모의 getX()를 호출하게 되고,
        // return x;를 반환하게 되는데 변수는 오버라이딩되지 않기 때문에
        // 자식의 x가 아닌 부모의 x를 반환
    }
    // 생성자 실행 순서
    // : Parent() >> Child() >> Child(int x) >> 실행
    // c.getX() 를 실행하므로 출력은 200이 나옴
}
