package Live_Sessions.Collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {

        Stack<String> stack =new Stack<>();
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        stack.push("selenium");
        System.out.println(stack);

        System.out.println(stack.peek()); //choose last element(from top of the stack)

        System.out.println(stack.pop()); // remove last element(from top of the stack)
        System.out.println(stack);

        stack.add("zebra"); // can use "add" method also
        stack.push("horse"); // but "push" method is a proper method, though it inherited "add" method
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("===========================================================");

        Queue<String> queue =new PriorityQueue<>();
        queue.offer("anna");
        queue.offer("vasya");
        queue.offer("asia");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
