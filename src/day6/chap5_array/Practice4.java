package day6.chap5_array;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        // 100 미만의 양의 정수들이 주어진다.
        // 입력 받다가 0이되면 마지막에 입력한 0을 제외하고
        // 그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇개인지
        // 작은수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10];
        int num = 0;

        while(true){
            System.out.print("숫자 입력 > ");
            num = sc.nextInt();
            if(num != 0){
                count[num/10]++;
            }else if(num>=100) {
                System.out.println("조건에 맞지 않습니다. 다시 입력하세요.");
            }else{
                for(int i = 0; i<count.length; i++){
                    System.out.println(i + ": " + count[i]);
                }
                break;
            }
        }
    }
}
