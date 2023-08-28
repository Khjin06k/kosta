package practice.chap8;
// [8-5] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
/*
1
3
5
1
2
5
6

 */
public class P5 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b)
                throw new ArithmeticException();
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        /*
        try에서 1 출력 >> if 문 >> 예외 발생 >> catch문 실행인데 RuntimeException에 해당 >> 3출력 , return >> finally 출력
         */
        method(false);
        /*
        try에서 1 출력 >> if문 해당 안됨 >> 2 출력 >> finally 출력 >> try 밖의 것 출력
         */
    }
}
