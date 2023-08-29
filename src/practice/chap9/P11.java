package practice.chap9;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        System.out.println("시작 단과 끝 단,  두 개의 정수를 입력해주세요.");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        for(int i = a; i<=b; i++){
            for(int j = 1; j<10; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
