package a_java.practice.chap5;

public class p4 {
    public static void main(String[] args) {
        // 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.


        int[][] arr = { {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                total += arr[i][j];
                count++;
            }
        }

        // average는 float 형태
        // 따라서 둘 다 int형인 total과 count 중 하나를 float 형태로 변경해야 함
        average = (float)total/count;

        System.out.println("totat = "+total);
        System.out.println("average = "+average);
    }
}
