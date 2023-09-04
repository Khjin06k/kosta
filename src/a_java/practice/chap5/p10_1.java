package a_java.practice.chap5;

public class p10_1 {
    public static void main(String[] args) {
        // 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                        '}', ';', ':', ',', '.', '/'};
        //0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "`~!wer";
        String result = "";
        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
            // ch가 숫자인지 알바벳인지를 먼저 판별한 후 어느 코드에서 가져올 것인지 판단 필요

            // ch가 소문자라면 기존에는 숫자이기 때문에 numCode에서 가져와야 함
            if('a' <= ch && ch <= 'z'){
                for(int j = 0; j<numCode.length; j++){
                    if(ch == numCode[j]){
                        result += (char)(j+'0');
                        break;
                    }
                }
                // ch가 소문자가 아니라면 abcCode에서 찾아야 함
            }else{
                for(int j = 0; j<abcCode.length; j++){
                    if(ch == abcCode[j]){
                        result += (char)(j+'a');
                        break;
                    }
                }
            }
        }
        System.out.println("src:"+src);
        System.out.println("result:"+result);

    }
}
