package day14.chap11_collectionFramework.set;


import java.util.Arrays;
import java.util.HashSet;

class Person{
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
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            return false;
        }
        Person p = (Person) obj;
        return name.equals(p.name) && age == p.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
public class HashSetTest {
    public static <Hash> void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(231, 45, 23, 8, 1, 45));
        for(Integer n : hs){
            System.out.print(n + "  "); // 출력되는 데이터의 순서가 보장되지 않음(Hash의 특징), 중복된 값은 한 번만 출력(Set의 툭징)
        }

        System.out.println();

        HashSet<Person> ahs = new HashSet<>();
        ahs.add(new Person("홍길동", 23));
        ahs.add(new Person("홍길동", 30));
        ahs.add(new Person("고길동", 33));
        ahs.add(new Person("하길동", 40));
        ahs.add(new Person("고길동", 33)); // 내가 만든 클래스에 대한 중복을 제거하기 위해서는 오버라이딩 필요

        for(Person p : ahs){
            System.out.println(p);
        }
    }
}
