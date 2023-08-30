package day14.chap11_collectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        // Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        // Vector는 Enumeration 이용
        Enumeration<Integer> en = vector.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        // ArrayList는 Iterator 이용
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
