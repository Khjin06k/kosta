package java.day3.chap4_doWhile;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        // 사용자로부터 입력받기 위해 Scanner 선언
        Scanner sc = new Scanner(System.in);

        // do-while문은 우선 시작을 한 다음 조건을 검증하기 때문에 반드시 한 번은 실행됨
        // 우선 처리한 후 처리한 결과를 가지고 반복을 결정해야 할 때 사용.

        // 0을 입력받을 때 까지 계속 입력 받으면서 더한다.
        int sum = 0;
        int in;
        do{
            in = sc.nextInt(); // 사용자에게 입력을 받아 저장하는 코드
            sum += in;
        } while(in != 0);
        System.out.println(sum);

        // 위를 while문으로 만든다면?
        in = sc.nextInt(); // do-while문이 아니기 때문에 먼저 in을 입력받은 다음에 while문을 실행해야 함
        while(in != 0){
            sum += in;
            in = sc.nextInt();
        }
        System.out.println(sum);
    }
}
