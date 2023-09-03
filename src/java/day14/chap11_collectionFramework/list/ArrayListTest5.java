package java.day14.chap11_collectionFramework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 {
    static void print(Object[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);
        System.out.println(list1); // 리스트는 toString이 오버라이딩 되어 있어서 리스트 내용을 보여줌
        // print(list1.toArray());

        List list2 = (List)list1.clone(); // 복사가 아닌 복제 (분리된 메모리이므로 list2를 변경하면 list2만 변경됨)
        list2.set(0,100);
        System.out.println(list2); // 2만 변경
    }
}
