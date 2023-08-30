package day14.chap11_collectionFramework.list;

import java.util.ArrayList;

class Person implements Comparable<Person>{
    String name;
    int age;
    Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age =age;
    }

    @Override
    public String toString() {
        return name+", "+age;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age; // 나이를 기준으로 정렬 >> 앞의 것이 크면 양수, 뒤의 것이 크면 음수, 동일하면 0을 반환하여 sort를 진행하게 됨
        // return name.compareTo(o.name); // 이름을 기준으로 정렬, 문자열은 compareTo가 존재
    }
}
public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); // Object 타입의 ArrayList
        list1.add(100);
        int n = (Integer)list1.get(0); // Object 타입이기 때문에 다운 캐스팅 필요

        ArrayList list2 = new ArrayList(); // Object 타입의 ArrayList
        list2.add(new Person());
        Person p1 = (Person) list2.get(0); // Object 타입이기 때문에 다운 캐스팅 필요

        // Object 대신 사용할 타입(클래스 타입 - int는 올 수 없고 Integer를 사용해야 함)을 지정할 수 있음(제너릭 - 타입을 지정해서 사용)
        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person());
        Person P2 = list3.get(0); // 다운 캐스팅을 하지 않아도 됨
    }
}
