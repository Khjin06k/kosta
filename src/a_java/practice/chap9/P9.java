package a_java.practice.chap9;
// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//메서드명 : delChar
//기 능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
//반환타입 : String
//매개변수 : String src - 변환할 문자열, String delCh - 제거할 문자들로 구성된 문자열
//[힌트] StringBuffer와 String클래스의 charAt(int i)과 indexOf(int ch)를 사용하라.
public class P9 {
    static String delChar(String src, String delCh) {

        // 처음 짠 코드
        String str = "";
        for(int i = 0; i<src.length(); i++){
            if(delCh.indexOf(src.charAt(i)) == -1) str += src.charAt(i);
        }
        return str;

        /* 강사님 코드 참고 내가 다시 짠 코드
        StringBuilder sb = new StringBuilder(src);
        for(int i = 0; i<sb.length(); i++){
            if(delCh.indexOf(sb.charAt(i)) != -1){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();*/

        /*강사님 코드
        StringBuilder sb = new StringBuilder(src);
        for(int i = 0; i<delCh.length(); i++){
            int index = 0;
            while(true){
                index = sb.indexOf(delCh.charAt(i)+"");
                if(index != -1) break;
                 sb.deleteCharAt(index);
             }
        }
        return sb.toString();*/
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));
    }
}
