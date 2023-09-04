package a_java.practice.chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

// [11-2] 다음 코드의 실행결과를 적으시오.제
// 7 6 3 2
public class P2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet set = new HashSet(list); // 중복 허용 x : 3,6,2,7
        TreeSet tset = new TreeSet(set); // 중복 허용을 하지 않으며, tree 구조(TreeSet은 작은 순서대로 출력) >> 2 3 6 7
        Stack stack = new Stack(); // LIFO 이기 때문에 뒤집어짐 >> 7 6 3 2
        stack.addAll(tset);

        while (!stack.empty())
            System.out.println(stack.pop());
    }
}
