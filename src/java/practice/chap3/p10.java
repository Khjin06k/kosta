package java.practice.chap3;

public class p10 {
    public static void main(String[] args) {
        // 다음은 소문자를 대문자로 변경하는 코드인데,
        // 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
        // 문자코드는 소문자가 대문자보다 32만큼 더 크다.
        // 예를 들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다.

        char ch = 'A';
        char lowerCase=(ch < 'a') ? (char)(ch + 32) :ch;
        System.out.println("upperCase:"+ch);
        System.out.println("lowerCase:"+lowerCase);
    }
}
