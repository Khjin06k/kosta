package day6.chap5_array;

public class Practice6 {
    public static void main(String[] args) {
        // 첫번째 행을 모두 1로 초기화 한 후 다음부터는 위와 왼쪽의 숫자를 더해서 배열에 저장하는 코드 작성
        int[][] arr = new int[5][5];
        // 첫 번째 행 배열의 요소를 1로 초기화
        for(int i = 0; i<arr[0].length; i++){
                arr[0][i] = 1;
        }

        // 왼쪽과 위의 숫자를 더해서 배열에 저장
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(j==0) arr[i][j] = arr[i-1][j]; // 맨 왼쪽은 왼쪽이 없기 때문에 위의 요소만 더하면 됨
                else arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }

        // 배열 출력
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        /* 강사님 코드
        // 배열 생성
        int[][] matrix = new int[5][6];

        // 첫 행을 1로 초기화
        for(int i = 0; i<matrix[0].length; i++){
            matrix[0][i] = 1;
        }

        // 배열에서 위와 왼쪽을 더해 값 저장
        for(int i = 1; i<matrix.length; i++){
            for(int j = 1; j<matrix[i].length; j++){
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
             }
         }

         // 배열 출력
         for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
         }

        */
    }
}
