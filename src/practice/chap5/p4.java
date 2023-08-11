package practice.chap5;

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
        average = total/(float)count;

        System.out.println("totat="+total);
        System.out.println("average="+average);
    }
}
