package day12.chap9_java_lang;

import java.util.HashSet;

class Person2{
    String name;
    int age;
    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age; // int의 hashCode는 동일하기에 그대로 넣으면 됨
    }

    @Override
    public String toString() {
        return "name='" + name  + ", age=" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person2 == false) return false;
        Person2 p = (Person2)obj;
        return name.equals(p.name) && age == p.age;
    }
}
public class HashCodeTest1 {
    public static void main(String[] args) {
        String str1 = "hong1";
        String str2 = "hong";
        String str3 = "hong";
        // 데이터가 다르면 100% 다른 해시코드를 만들어짐
        /*System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());*/

        Person2 p1 = new Person2("hong", 24);
        Person2 p2 = new Person2("hong", 24);
        Person2 p3 = new Person2("hong", 25);
        /*System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());*/

        System.out.println(p1.equals(p2));

        // HashSet은 동일한 데이터가 들어가지 않기 때문에 내부에서 같은 데이터의 입력인지 확인이 필요
        // 따라서 HashCode()와 equals() 함수로 판단해야 하기 때문에 이 둘의 오버라이딩이 필요
        // (equals나 hashCode 중 하나라도 오버라이딩하여 판단하지 않을 경우 동일한 값이 중복으로 출력됨)
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(10); // 동일한 데이터를 넣으면 1개만 나옴 (Set은 집합의 개념)
        hs.add(20);
        hs.add(p1);
        hs.add(p2);
        for(Object o : hs){
            System.out.println(o);
        }
    }
}
