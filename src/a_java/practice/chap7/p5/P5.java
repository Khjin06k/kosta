package a_java.practice.chap7.p5;
// 다음의 코드는 컴파일하면 에러가 발생한다.
// 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(){} // 추가 코드 >> 부모 클래스에 기본 생성자를 생성
    Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product {
    Tv() {
       // super(0); >> 부모 클래스의 생성자를 호출
    } // 에러가 나는 이유는 상속을 받고 있는 부모 클래스의 Product에 기본 생성자가 없기 때문에 발생하는 에러다.
    // 부모 클래스에 기본 생성자를 생성하거나 TV 안에 부모클래스의 생성자를 호출

    public String toString() {
        return "Tv";
    }
}
public class P5 {
    Tv t = new Tv();
}
