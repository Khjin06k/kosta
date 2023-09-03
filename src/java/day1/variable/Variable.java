package java.day1.variable;

public class Variable {
    public static void main(String[] args) {
        // 문자형 2바이트
        // char (자료형) ch (변수명) = (대입형 연산자; 오른쪽의 것을 왼쪽에 넣는다의 의미로 같다가 아님) 'A' (리터럴 데이터)
        // 변수명에 특수문자는 _, $만 허용
        // 변수의 선언과 초기화를 동시에 했으며, 변수는 언제든지 값을 변경할 수 있음
        char ch = 'A';
        ch = 'B';
        System.out.println(ch);

        // 상수(final 타입) 이름은 대문자로 하며, 이는 한 번 지정하면 변경할 수 없는 수 있음
        final double PI = 3.14;
        // PI = 5.32; >> 변경이 불가능하기 때문에 에러 발생

        // byte b = 1000; byte는 8비트이기 때문에 1000이 되면 에러가 발생 (-128~127까지) >> 계산 및 보수 정리는 블로그 참고
        // 이진수의 맨 앞은 값을 나타내는데 쓰이지 않으며, 이는 0이면 양수, 1이면 음수를 나타냄
        // char형은 음수가 존재하지 않음
        byte bt = 127;
        System.out.println(bt);
        int i = 0;
        double d = 0.0;
        float f = 0.0F;
        boolean b = true;

        String str = "str"; // String(문자열) 타입의 경우 기본 자료형 타입이 아니기 때문에 소문자가 아닌 대문자로 시작함 >> 이는 참조형 타입

        // 우리의 시스템은 64비트가 기본이기 때문에 이를 실행하면 64비트에 최적화됨. 따라서, byte를 쓰더라도 이를 실행하면 자동으로 빈 공간을 채우게 됨.
        // 따라서 정수형은 int, 실수형은 double이 기본형이 됨.
    }
}
