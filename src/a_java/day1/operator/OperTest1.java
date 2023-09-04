package a_java.day1.operator;

public class OperTest1 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i);
        System.out.println("i++의 결과 = " + i++); // 10 출력, 결과값을 출력하고나서 1 증가
        i = 10;
        System.out.println("++i의 결과 = " + ++i); // 11 출력, 결과값을 증가시키고 나서 결과값을 출력
        System.out.println("i--의 결과 = " + i--); // 10 출력, 결과값을 출력하고 나서 1 갑소
        i = 10;
        System.out.println("--i의 결과 = " + --i); // 9 출력, 결과값을 감소시키고 나서 결과값을 출력
    }
}
