package java.practice.chap8;
// [8-10] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
/*
2 try문 실행 >> method1 실행 >> try문 실행 >> method2 실행 >> 예외 발생 >> NullPoint예외이므로 2 출력 >> e를 던지는데 메서드를 호출한 곳으로 던짐
4 메서드 호출한 곳으로 이동하기 전에 finally가 있으므로 4 출력
7 예외 발생했으므로 e를 catch로 받아 7 출력
 */
public class P10 {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println(6);
        } catch (Exception e) {
            System.out.println(7);
        }
    }

    static void method1() throws Exception {
        try {
            method2();
            System.out.println(1);
        } catch (NullPointerException e) {
            System.out.println(2);
            throw e;
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    } // method1()
    static void method2() {
        throw new NullPointerException();
    }

}
