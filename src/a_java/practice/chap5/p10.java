package a_java.practice.chap5;

public class p10 {
    public static void main(String[] args) {
        // 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                        '}', ';', ':', ',', '.', '/'};
                        //0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";
        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
            // ch가 숫자인지 알바벳인지를 먼저 판별한 후 어느 코드에서 가져올 것인지 판단 필요

            // src의 문자열은 a~z와 숫자로만 이루어져 있기 때문에 아스키코드 기준 'a'보다 크거나 같으면 소문자, 작은것은 숫자로 분류 가능
            // ch가 문자라면
            if(ch >= 'a'){
                result += abcCode[ch-'a'];
            // 문자가 아닌 숫자라면
            }else{
                result += numCode[ch-'0'];
            }
        }
       System.out.println("src:"+src);
       System.out.println("result:"+result);

    }
}
