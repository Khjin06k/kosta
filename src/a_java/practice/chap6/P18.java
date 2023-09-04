package a_java.practice.chap6;
// 다음의 코드를 컴파일 하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
public class P18 {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;
   // static int cv2 = iv;
    static void staticMethod1() {
        System.out.println(cv);
       // System.out.println(iv); >> static 메서드에서는 인스턴스 변수 사용이 불가능함
    }
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }
    static void staticMethod2() {
        staticMethod1();
       // instanceMethod1(); >> static 메서드에서는 인스턴스 메서드 사용이 불가능함
    }
    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
