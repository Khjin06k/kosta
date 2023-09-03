package java.day13.chap9_java_lang;

public class WrapperTest1 {
    public static void main(String[] args) {
        int m = 10;
        // // m과 n 은 다른타입, Boxing(알아서 자동 형변환)
        Integer n = m;
        long l = m;
        int r = n; // UnBoxing

        Object obj = 100; // Boxing 된 다음에 updatsing 진행
        // Object 타입은 Boxing과 업캐스팅이 가능하기 때문에 primitive type 가능
    }
}
