package java.practice.chap3;

public class p9 {
    public static void main(String[] args) {
        // 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만
        // 변수 b 의 값이 true가 되도록 하는 코드이다.

        char ch = 'z';
        boolean b=('0'<=ch && ch <='9' || 'A'<=ch && ch <= 'Z' || 'a' <= ch && ch <= 'z');
        System.out.println(b);
    }
}
