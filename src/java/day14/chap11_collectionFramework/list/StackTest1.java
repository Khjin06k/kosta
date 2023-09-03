package java.day14.chap11_collectionFramework.list;

import java.util.Stack;

public class StackTest1 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(100); // 데이터 입력
        stack1.push(200);
        stack1.push(300);
        stack1.push(400);
        stack1.push(500);

        System.out.println(stack1.pop()); // 데이터 출력
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

    }
}
