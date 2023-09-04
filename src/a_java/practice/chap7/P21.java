package a_java.practice.chap7;

// 다음과 같이 attack메서드가 정의되어 있을 때,
// 이 메서드의 매개변수로 가능한 것 두 가지를 적으시오.
// 답 : null, Movable 인터페이스를 구현한 클래스 또는 그 자손의 인스턴스
public class P21 {
    interface Movable {
        void move(int x, int y);
    }
    void attack(Movable f) { /* 내용 생략 */
    }
}
