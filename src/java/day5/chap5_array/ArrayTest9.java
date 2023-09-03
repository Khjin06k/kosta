package java.day5.chap5_array;

public class ArrayTest9 {
    public static void main(String[] args) {
        // 각 행의 합계 구하기
        int[][] narr = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };

        int[][] result = new int[narr.length+1][narr[0].length+1];
        for(int i = 0; i<narr.length; i++){
            for(int j = 0; j<narr[i].length; j++){
                // 기존 배열의 값을 result에 저장
                result[i][j] = narr[i][j];
                // 해당 행의 마지막 요소에 값을 계속 더함
                result[i][result[i].length-1] += narr[i][j];
                // 마지막 행에 각 열을 더함
                result[result.length-1][j] += narr[i][j];
                // 모든 요소의 합을 마지막 행 마지막 요소에 더함
                result[result.length-1][result[i].length-1] += narr[i][j];
            }
        }

        for(int i = 0; i<result.length; i++){
            for(int j = 0; j<result[i].length; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
