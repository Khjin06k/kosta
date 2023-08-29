package day13.chap9_java_lang;

public class StringBufferTest1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        String s1 = new String(sb);
        System.out.println(s1); // "abc" 출력
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder(100);
        sb1.append("abcdefg");
        System.out.println(sb1.capacity()); // 용량
        System.out.println(sb1.length()); // 문자열의 길이

        sb1.insert(1, 'd'); // 1번째에 'd' 삽입
        System.out.println(sb1);
        System.out.println(sb1.length());

        sb1.delete(2, 5);
        System.out.println(sb1); // 2~4인덱스 삭제
        System.out.println(sb1.length());
    }
}
