package a_java.day13.chap9_java_lang;

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


        sb1.replace(0, 2, "ta"); // 0~1 인덱스의 문자를 마지막 str 문자열로 변경
        System.out.println(sb1);

        sb1.reverse(); // 문자열 뒤집기
        System.out.println(sb1);

        sb1.setCharAt(2, 'E'); // 지정한 인덱스의 char를 바꾸는 것
        System.out.println(sb1);

        System.out.println(sb1.length());
        sb1.setLength(10); // 길이가 늘어나고, 이는 공백이 추가됨. 혹은 길이가 줄어들고, 문자가 잘림
        System.out.println(sb1);
        System.out.println(sb1.length());
    }
}
