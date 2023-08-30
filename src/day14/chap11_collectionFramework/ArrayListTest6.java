package day14.chap11_collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest6 {
    public static void main(String[] args) {
        // asList의 파라미터를 가지고 값을 넣어주는 것 (배열을 리스트 형태로 변환)
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);
        numbers.removeIf(n -> (n%3)==0); // n은 파라미터, n을 하나씩 가져와서 뒤의 코드를 실행 >> n을 하나씩 가져와 3으로 나누어 떨어지면 삭제하라는 의미
        System.out.println(numbers);
    }
}
