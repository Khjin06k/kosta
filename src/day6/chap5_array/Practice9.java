package day6.chap5_array;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        // 파스칼 삼각형은 첫 번째 줄 첫 번째 행을 1로 초기화한 후
        // 다음 줄부터는 바로 위의 값과 바로 위 왼쪽의 값을 더한 값이 되도록 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];

        // 배열의 첫 행을 1로 초기화
        for(int i = 0; i<arr.length; i++){
            arr[0][i] = 1;
        }

        // 파스칼 삼각형이 될 수 있도록 입력
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<=i; j++){
                if(j==0) arr[i][j] = arr[i-1][j];
                else if(j==i) arr[i][j] = 1;
                else arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
            }
        }

        // 파스칼 삼격형 출력
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
