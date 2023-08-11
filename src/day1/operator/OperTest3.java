package day1.operator;

public class OperTest3 {
    public static void main(String[] args) {
        // 정수형, 실수형의 경우 int나 double형보다 작은 것끼리 연산할 경우(ex. short/short)는 기본적으로 int, double형으로 자동으로 형변환 되어 결과값이 출력됨
        System.out.println("10/4 = " + 10/4); // 자바의 경우 변수를 선언해서 지정하기 때문에 같은 타입끼리 연산이 가능. 둘 다 정수형이기 때문에 결과값도 정수형
        System.out.println("10.0/4 = " + 10.0/4); // 둘 중 하나가 실수형이기 때문에 자동으로 형변환이 되어 결과값이 실수형이 됨(정수형보다 실수형이 더 크기 때문에 실수형으로 자동 형변환이 진행됨)
        System.out.println("10/4.0 = " + 10/4.0);

        // 예제 ) 국어, 영어, 수학의 전체 점수와 평균을 구하고, 평균은 소수점자리까지 나타내세요.
        int kor = 99, eng = 88, math = 100;
        int total = kor+eng+math;
        double avg = total/3.0; // total이 int 타입이기 때문에 double형이 되려면 나누는 수가 실수형이 되어야 함.
        System.out.println("전체 점수 = "+total+ " 평균 = " + avg);

        // 형변환
        int mod = 10%4;
        System.out.println("10%4 = " + mod);

        byte a = 10;
        byte b = 20;
        byte c = (byte)(a+b); // 전체적으로 형변환을 진행해줘야 함

        int i1 = 100000;
        int i2 = 200000;
        long res = (long)i1 * i2; // i1*i2 자체의 결과값이 int 이기 때문에 오버플로우가 발생함. 따라서 하나라도 long 이어야 결과값이 대입됨
        System.out.println("100000 * 200000 = " + res);

        long l = 100000L*200000;

        int l2 = 100000*100000/100000; // 이미 앞의 곱하기 연산에서 오버플로우가 발생했기 때문에 에러 발생. 따라서 long으로 변환 후 계산해야 함.

        int l3 = 100000/100000*10000; //
    }
}
