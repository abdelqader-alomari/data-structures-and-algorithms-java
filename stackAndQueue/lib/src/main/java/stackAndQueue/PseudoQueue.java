package stackAndQueue;

public class PseudoQueue {
    Stack stackOne = new Stack();
    Stack stackTwo = new Stack();

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
            System.out.println("The stack is empty");
        }
        String data = stackTwo.peek();
        stackTwo.pop();
        return data;
    }

    @Override
    public String toString() {
        return "PseudoQueue{" + "stackTwo=" + stackTwo + '}';
    }
}
