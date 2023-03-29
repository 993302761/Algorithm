package queue;

import java.util.ArrayDeque;
//两个栈实现队列
public class Stack {

    public static void main(String[] args) {
        ArrayDeque deque1=new ArrayDeque();
        ArrayDeque deque2=new ArrayDeque();
        for (int i = 0; i < 10; i++) {
            deque1.push(i);
        }

        for (int i = 0; i < 10; i++) {
            deque2.push(deque1.pop());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(deque2.pop());
        }
    }
}
