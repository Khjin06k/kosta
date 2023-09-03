package java.day3.chap5_array;

public class ArrayTest {
    public static void main(String[] args) {
        // 아래 둘 다 가능하나 첫번째 것을 많이 사용
        int[] arr; // arr 자체는 해당 배열이 시작하는 주소값(4바이트)를 나타냄
        int arr1[];

        // 둘의 차이점은 각 배열이 차지하고 있는 메모리의 크기(주소는 4바이트로 동일하기에 배열명의 크기는 동일함)
        int[] arr2 = new int[5]; // int는 하나당 4바이트
        double[] arr3 = new double[5]; // double은 하나당 8바이트

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        int sum = 0;
        for(int i = 0; i<arr2.length; i++){
            sum += arr2[i];
        }
        System.out.println(sum);

    }
}
