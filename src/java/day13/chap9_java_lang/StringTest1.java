package java.day13.chap9_java_lang;

public class StringTest1 {
    public static void main(String[] args) {
        String a = "a"; // a만 저장된 주소
        a = "b"; // b만 저장된 주소
        a +="b"; // ab만 저장된 주소
        // 동일한 변수 a 에 저장된 것이지만 각각이 생성되며, 해당 주소값이 다르고 그의 주소값이 a에 저장되는 것

        int n = 10;
        n = 20;

        String s1 = null;
        String s2 = ""; // null을 담고있는 메모리의 주소를 가짐 (문자열은 보이지는 않지만 마지막은 모두 null로 끝남)

        String s3 = new String("abc");
        char[] c = {'a', 'b', 'c'};
        String s4 = new String(c);
        System.out.println(s3.equals(s4)); // 둘의 결과는 동일

        String bs = "hello ";
        String cs = bs.concat("world");
        System.out.println(bs);
        System.out.println(cs);
        System.out.println(bs);
        System.out.println(cs.contains("hello")); // true

        String filename = "test.txt";
        System.out.println(filename.endsWith("hwp")); // false

        String[] files = {"test.txt", "temp.hwp", "backup.txt"};
        for(int i = 0; i<files.length; i++){
            if(files[i].endsWith("txt")) System.out.println(files[i]); // 확장자가 txt인 것만 출력
        }
    }
}
