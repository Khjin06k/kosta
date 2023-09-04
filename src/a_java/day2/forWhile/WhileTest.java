package a_java.day2.forWhile;

public class WhileTest {
    public static void main(String[] args) {
        // while문 : 조건식이 참인 동안 반복 진행

        // 구구단 2단
        int i = 1;
        int j = 2;
        while(i<=9){
            System.out.print(String.format("%dX%d=%2d\t", j, i, i*j));
            i++;
        }

        System.out.println();

        // 구구단 2단~9단
        i = 1;
        while(i<=9){
            j = 2;
            while(j<=9){
                System.out.print(String.format("%dX%d=%2d\t", j, i, i*j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
