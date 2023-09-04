package a_java.day1.variable;

public class StringPlus {
    public static void main(String[] args) {
        // int v1=10, v2 = 20; >> 같은 타입은 한 번에 선언이 가능
        int v1 = 10;
        int v2 = 20;
        int res = v1+v2; // v1, v2는 피연산자, +는 연산자, =는 대입 연산자
        System.out.println("res = " + res);

        String str1 = "avc";
        String str2 = "def";
        String str = str1+str2; // 피연산자가 숫자가 아니더라도 + 연산이 가능. 피연산자에서 하나라도 문자열이면 문자열화 시켜서 문자화 시킴. 다만 순서에 유의해야 함.
        System.out.println("str = "+ str);

        System.out.println(v1+v2+str1); // 30abc >> 앞에서부터 차례대로 계산되기 때문에 숫자끼리의 연산 이후 문자열과 결합됨
        System.out.println(v1+str1+v2); // 10abc20
        System.out.println(str1+v1+v2); // abc1020

        String seven = "7";
        char seven2 = '7';
        int seven3 = 7;
        System.out.println(seven + seven2 + seven3); // 777
        System.out.println(seven2+seven3+seven); // 627 : seven2와 seven3가 더해진 것은 아스키코드 값이 더해진 것이기 때문에 seven2는 값이 55이므로 62가 된 이후 문자열 "7"과 더해져 627이라는 문자열이 출력됨
        System.out.println(seven3+seven+seven2); /// 777
    }
}
