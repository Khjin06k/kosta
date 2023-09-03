package java.day5.chap5_array;

public class ArrayTest7 {
    public static void main(String[] args) {
        // 초기화를 동시에 할 때에는 인덱스에 값을 지정하는 것을 허용하지 않음(길이를 지정하지 않음)
        int[][] narr2 = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};


        // 명확히 3행 4열을 잡은 것
        int[][] narr3 = new int[3][4];
        // 각 행마다 초기화 진행
        narr3[0] = new int[] {1,2,3,4};
        narr3[1] = new int[] {5,6,7,8};
        narr3[2] = new int[] {9,10,11,12};

        // 위와 같이 행별로 초기화 할 때에는 아래와 같이 선언을 하는 경우가 많음
        // 또한 아래와 같이 행별로 초기화 했을 때 열의 개수가 다르다면 이는 '가변배열' 이라고 함
        int[][] narr4 = new int[3][];
        narr4[0] = new int[] {1,2,3,4, 5};
        narr4[1] = new int[] {10,20};
        narr4[2] = new int[] {100, 200, 300};


    }
}
