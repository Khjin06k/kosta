package java.day6.chap5_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        // 입력 데이터 수 : 5
        // 95 / 100 / 85 / 77 / 60
        // 출력60 75 85 95 100

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

        // 배열 정렬


        //1) Arrays 이용
        Arrays.sort(arr);

        // 2-1) 두 숫자를 비교하면서 뒤의 수가 더 크다면 자리 변경 (퀵솔트? 정렬)
        /*for(int j = 0; j<arr.length; j++){
        // 제일 큰 수가 오른쪽으로 오게 됨
            for(int i = 1; i<arr.length-j; i++){
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }*/

        // 2-2) 두 숫자를 뒤에서부터 비교하면서 둘 중 작은 것을 왼쪽에 위치하도록 자리 변경
        /*for(int i = 0; i<arr.length; i++){
            for(int j = arr.length-1; j>=i+1; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }*/

        /*
        // 3) 배열 중 최소값을 찾아 맨 처음 숫자와 교환
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i; j<arr.length; j++){
                if(arr[min]>arr[j]) min = j; // 최소값이 위치한 곳의 인덱스를 저장
            }
            // swap 진행 (최소값이 위치한 곳과 맨 처음)
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }*/

        // 배열 출력
        System.out.println("정렬된 데이터는 다음과 같습니다.");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

