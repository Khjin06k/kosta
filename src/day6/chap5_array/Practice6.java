package day6.chap5_array;

public class Practice6 {
    public static void main(String[] args) {
        // 배열을 모두 1로 초기화 한 후 다음부터는 위와 왼쪽의 숫자를 더해서 배열에 저장하는 코드 작성
        int[][] arr = new int[5][5];
        // 배열의 요소를 1로 초기화
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                arr[i][j] = 1;
            }
        }

        // 왼쪽과 위의 숫자를 더해서 배열에 저장
        for(int i = 1; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }

        // 배열 출력
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
