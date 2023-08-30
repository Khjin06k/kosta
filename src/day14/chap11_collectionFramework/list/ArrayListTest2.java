package day14.chap11_collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest2 {
    static void print(List<Integer> list){
        for(Integer n : list){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void print2(List<Person> list){
        for(Person n : list){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        ArrayList<Integer> list2  = new ArrayList<>(list1); // ArrayList를 새로 만들어 대입 가능
        print(list1);
        print(list2); // 2개가 동일하게 출력됨

        List<Integer> sublist1 = list1.subList(2, 4); // list의 일부만 가져오기, subList는 List의 인터페이스의 메서드 >> 부모의 것을 오버라이딩 - 리턴 타입 변경이 불가능
        print(sublist1);

        Collections.sort(list1); // 원본(list1)을 정렬
        print(list1);

        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person("hong", 30));
        list3.add(new Person("song", 20));
        list3.add(new Person("gong", 25));
        print2(list3);
        Collections.sort(list3); // 에러 발생(sort을 하기 위한 기준이 없어서) >> Person에 Comparable을 상속(implement) 받은 후 compareTo를 오버라이딩 해야 사용 가능
        print2(list3);
    }
}
