package a_java.practice.chap3;

public class p3 {
    public static void main(String[] args) {
        // 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다.
        // 삼항 연산 자를 이용해서 (1)에 알맞은 코드를 넣으시오.

        int num = 10;
        System.out.println(num>0 ? "양수" : (num==0) ? "0" : "음수");
    }
}
