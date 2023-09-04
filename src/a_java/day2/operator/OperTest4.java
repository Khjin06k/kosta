package a_java.day2.operator;

public class OperTest4 {
    public static void main(String[] args) {
        // 삼항 연산자
        int x = 10, y = 20;
        int max = (x>=y) ? x : y;
        System.out.println("x와 y 중 큰 값 = " + max);

        // 복합 대입 연산자
        int i = 10;
        i *= 3+5; // 복합 대입연산자의 우선순위는 제일 마지막이기 때문에 3+5가 먼저 연산된 후 결과값 도출
        System.out.println("i *= 3+5 = " + i);
    }
}
