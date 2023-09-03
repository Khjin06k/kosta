package java.day14.chap11_collectionFramework.set;


import java.util.Arrays;
import java.util.HashSet;

class Person1 implements Comparable{
    String name;
    int age;
    Person1(){}
    public Person1(String name, int age){
        this.name = name;
        this.age =age;
    }

    @Override
    public String toString() {
        return name+", "+age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person1){
            return false;
        }
        Person1 p = (Person1) obj;
        return name.equals(p.name) && age == p.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public int compareTo(Object o) {
        Person1 p = (Person1) o;
        return age - p.age;
    }
}
public class HashSetTest {
    public static <Hash> void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(231, 45, 23, 8, 1, 45));
        for(Integer n : hs){
            System.out.print(n + "  "); // 출력되는 데이터의 순서가 보장되지 않음(Hash의 특징), 중복된 값은 한 번만 출력(Set의 툭징)
        }

        System.out.println();

        HashSet<Person1> ahs = new HashSet<>();
        ahs.add(new Person1("홍길동", 23));
        ahs.add(new Person1("홍길동", 30));
        ahs.add(new Person1("고길동", 33));
        ahs.add(new Person1("하길동", 40));
        ahs.add(new Person1("고길동", 33)); // 내가 만든 클래스에 대한 중복을 제거하기 위해서는 오버라이딩 필요

        for(Person1 p : ahs){
            System.out.println(p);
        }
    }
}
