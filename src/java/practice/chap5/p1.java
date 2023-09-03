package java.practice.chap5;

public class p1 {
    public static void main(String[] args) {
        // 다음은 배열을 선언하거나 초기화한 것이다.
        // 잘못된 것을 고르고 그 이유를 설명 하시오.
        //a. int[] arr[];
        //b. int[] arr = {1,2,3,};
        //c. int[] arr = new int[5];
        //d. int[] arr = new int[5] {1,2,3,4,5};
        //e. int arr[5];
        //f. int[] arr[] = new int[3][];

        // 답 :
        // d번 - int[5]가 아닌 int[]로 한 후 초기화 해줘야 함.
        // e번 - 배열로 선언됨과 동시에 length를 지정. int[] arr 혹은 int arr[]로 선언을 먼저 해줘야 함
    }
}
