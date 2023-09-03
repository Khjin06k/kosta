package java.day16;

import java.util.StringTokenizer;

public class StringTokenizerTest1 { // split처럼 문자열을 특정 구분자로 나누는 방법
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("apple banana orange"); // 아무것도 없으면 스페이스 기준으로 구분
        while(st1.hasMoreTokens()){ // 배열 형태가 아닌 반복문을 돌려야 하나씩 가져올 수 있음
            System.out.println(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer("apple,banana,orange", ",", true); // 구분자가 주어지면 구분자로 구분, true로 하면 구분자도 하나의 데이터로 판단하게 됨 (default는 false)
        while(st2.hasMoreTokens()){ // 배열 형태가 아닌 반복문을 돌려야 하나씩 가져올 수 있음
            System.out.println(st2.nextToken());
        }
        StringTokenizer st3 = new StringTokenizer("apple#banana$orange,kiwi", "#$,"); // 구분자를 여러개 설정 가능
        System.out.println(st3.countTokens()); // 개수 출력
        while(st3.hasMoreTokens()){ // 배열 형태가 아닌 반복문을 돌려야 하나씩 가져올 수 있음
            System.out.println(st3.nextToken());
        }
    }
}
