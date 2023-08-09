package day1.operator;

public class OperTest2 {
    public static void main(String[] args) {
        // 부호 연산자
        int i = -10;
        System.out.println("i의 값 = " + i);
        System.out.println("+i의 결과 = " + +i);
        System.out.println("-i의 결과 = " + -i);

        // 부정 연산자
        boolean power = false;
        System.out.println("power의 값 = " + power);
        System.out.println("!poswer의 결과 = " + !power);
        System.out.println("!poswer의 결과 = " + !power);

        // 보수 연산자
        i = 10;
        System.out.println("i의 값 = " + i);
        System.out.println("i의 보수(~i) 결과값 = " + ~i);

    }
}
