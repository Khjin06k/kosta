package java.day5.chap5_array;

public class ArrayTest8 {
    public static void main(String[] args) {
        // 배열 요소의 합계 구하기
        int[][] narr = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };
        int answer = 0;
        for(int i = 0; i<narr.length; i++){
            for(int j = 0; j<narr[i].length; j++){
                answer += narr[i][j];
            }
        }
        System.out.println("answer = " + answer);
    }
}
