package day3.chap5_array;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 위와 같이 선언만 해주면 값을 넣어주지 않아도 에러가 나지 않는데, 배열의 경우 0으로 기본값이 들어있음.
        // 이는 메모리의 영역이 다르기 때문 (new의 메모리 영역은 자동 초기화가 되어 있음)
        int[] arr1 = new int[] {1,2,3,4,5}; // 배열 초기화1
        int[] arr2 = {1,2,3,4,5}; // 배열 초기화2
        int[] arr3;
        arr3 = new int[] {1,2,3,4,5};
        // arr3 = {1,2,3,4,5}; // 선언과 초기화를 따로 할 때에는 new를 생략할 수 없음
    }
}
