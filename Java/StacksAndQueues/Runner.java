package StacksAndQueues;

import StacksAndQueues.Model.Queue;
import StacksAndQueues.Model.Stack;

public class Runner {
    
    public static void main(String[] args) {

        // QUEUES
        System.out.println("QUEUES");
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        // STACKS
        System.out.println("STACKS");
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
