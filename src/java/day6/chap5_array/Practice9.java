package java.day6.chap5_array;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        // 파스칼 삼각형은 첫 번째 줄 첫 번째 행을 1로 초기화한 후
        // 다음 줄부터는 바로 위의 값과 바로 위 왼쪽의 값을 더한 값이 되도록 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];

        // 배열의 첫번째 요소만을 1로 초기화
        arr[0][0] = 1;

         /*for(int i = 0; i<arr.length; i++){
            만약 첫번째 열과 대각선을 1로 초기화 하고 싶다면 아래와 같이 for문 진행
            arr[i][0] = 1; // 첫번째 열을 1로 초기화
            arr[i][i] = 1; // 대각선을 1로 초기화

        }*/

        // 파스칼 삼각형이 될 수 있도록 입력 >> 자신을 기준으로 자신의 위 요소와 위의 왼쪽 요소를 합함
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<=i; j++){ // 대각선 요소를 1로 초기화 했다면 i와 j가 동일하지 않아도 됨
                if(j==0) arr[i][j] = arr[i-1][j]; // 맨 첫번재 열이라면 왼쪽 요소가 없어 윗 요소만 넣으면 됨
                else if(j==i) arr[i][j] = 1; // 행의 마지막 요소라면 1이 되어야 함(대각선)
                else arr[i][j] = arr[i-1][j]+arr[i-1][j-1]; // 자신을 기준으로 위 요소와 위의 왼쪽 요소를 더한다.
            }
        }

        // 파스칼 삼격형 출력 >> 아래로 갈수록 넓어지는 삼각형 형태 출력이기 때문에 행이 커질수록 열도 같이 커진다
        // 즉, 행과 열이 같이 커지기 때문에  i와 j가 같이 커지면서 열이 행보다 커지지 않도록 하면 됨
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
