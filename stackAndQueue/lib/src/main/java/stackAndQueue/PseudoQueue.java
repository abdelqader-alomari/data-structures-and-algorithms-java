package stackAndQueue;

import java.util.Stack;

public class PseudoQueue {
    java.util.Stack stackOne = new java.util.Stack();
    java.util.Stack stackTwo = new Stack();

    public String enqueue(String data) {
        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        stackTwo.push(data);

        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        return data;
    }

    public String dequeue() {
        if (stackTwo == null) {
            System.out.println("Stack is empty");
        }
        String data = (String) stackTwo.peek();
        stackTwo.pop();
        return data;
    }

}
