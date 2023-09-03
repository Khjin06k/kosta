package java.day5.chap5_array;

public class ArrayTest11 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = arr1.clone(); // 배열을 생성하고 값을 복사하여 리턴 진행
        arr1[0] = 100;

        for(int i = 0; i<arr1.length; i++){
            if(i==arr1.length-1) System.out.print(arr1[i]);
            else System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        for(int i = 0; i<arr3.length; i++){
            if(i==arr3.length-1) System.out.print(arr3[i]);
            else System.out.print(arr3[i] + ", ");
        }
    }
}
