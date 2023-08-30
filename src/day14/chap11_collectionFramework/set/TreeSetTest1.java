package day14.chap11_collectionFramework.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(50);
        ts.add(30);
        ts.add(150);

        System.out.println(ts); // TreeSet이기 때문에 정렬이 되어서 출력됨

        TreeSet<Person1> tsp = new TreeSet<>(new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o1.age - o2.age;
            }
        });

        tsp.add(new Person1("hong", 20));
        tsp.add(new Person1("song", 10));
        tsp.add(new Person1("gong", 50));
        tsp.add(new Person1("hong", 30));
        tsp.add(new Person1("pong", 40));
        System.out.println(tsp);
        SortedSet<Person1> subList = tsp.subSet(new Person1("", 20), new Person1("", 60)); // 20~60 사이의 나이인 Person1만 출력
        System.out.println(subList);

    }
}
