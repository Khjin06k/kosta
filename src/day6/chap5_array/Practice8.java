package day6.chap5_array;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        // 입력 데이터 수 : 5
        // 95 / 100 / 85 / 77 / 60
        // 출력 최솟값:60, 최댓값:100

        Scanner sc = new Scanner(System.in);

        // 입력받은 데이터 수 지정
        System.out.print("입력받을 데이터 개수를 입력하세요 > ");
        int dataSize = sc.nextInt();
        int[] arr = new int[dataSize];

        // 데이터 입력받기
        for(int i = 0; i<arr.length; i++){
            System.out.print("입력 데이터 " + (i+1)+"번 > ");
            arr[i] = sc.nextInt();
        }

        // 최대, 최솟값 구하기
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }

        System.out.println("최솟값 : " + min);
        System.out.println("최댓값 : " + max);
    }
}
