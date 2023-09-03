package java.day15.chap11_collectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Human implements Comparable{
    String id;
    String name;
    int age;
    String address;
    public Human(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Human s = (Human) o;
        return id.compareTo(s.id); // id 기준 정렬
        //return name.compareTo(s.name); // 이름 기준 정렬
        //return age-s.age; // 나이 기준 정렬
        // return address.compareTo(s.address); // 주소 기준 정렬
    }
}
public class Practice5Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // 타입 지정하지 않음
        //ArrayList<Human> list = new ArrayList<>(); // 타입 지정

        list.add(new Human("000123", "홍길동", 24, "서울시 금천구"));
        list.add(new Human("931216" , "남궁성", 32, "경기도 광명시"));
        list.add(new Human("880505", "김자바", 37, "서울시 강서구"));
        list.add(new Human("991101", "이자바", 27, "경기도 과천시"));
        list.add(new Human("021213","안자바", 22, "서울시 송파구"));
        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
