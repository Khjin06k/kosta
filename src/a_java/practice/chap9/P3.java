package a_java.practice.chap9;
// 다음과 같은 실행결과가 나오도록 코드를 완성하시오.
public class P3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
        // \t는 탭을 의미 "\tapple"이라고 문자열을 쓰더라도 그대로 나오는 것이 아님.
        // 따라서 \를 그 자체로 인식하기 위해서는 "\\"이라고 하면 \로 출력됨
        String path = "";
        String fileName = "";
        /*
        (1) 알맞은 코드를 넣어 완성하시오.
        */
        int lastInd = fullPath.lastIndexOf("\\");
        path = fullPath.substring(0, lastInd+1);
        fileName = fullPath.substring(lastInd+1);

        System.out.println("fullPath:"+fullPath);
        System.out.println("path:"+path);
        System.out.println("fileName:"+fileName);
    }
}
