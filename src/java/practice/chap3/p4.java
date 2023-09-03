package java.practice.chap3;

public class p4 {
    public static void main(String[] args) {
        // 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
        // 만일 변수 num 의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다.

        int num = 456;
        System.out.println(num-(num%100));
    }
}
