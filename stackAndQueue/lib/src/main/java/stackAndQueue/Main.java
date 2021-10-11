package stackAndQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Stack<Number> stack = new Stack<Number>();
        stack.push("O");
        stack.push("M");
        stack.push("A");
        stack.push("R");
        stack.push("I");
        System.out.println("The Stack data is:" + stack);
        System.out.println("The top of the stack is => " + stack.peek());

        System.out.println(stack.pop());

        System.out.println("The top of the stack is => " + stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue queue = new Queue();

        queue.enqueue("O");
        queue.enqueue("M");
        queue.enqueue("A");
        queue.enqueue("R");
        queue.enqueue("I");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("The front of the Queue is => " + queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());





        PseudoQueue PseudoQueue = new PseudoQueue();

        System.out.println("Push Start here: ");
        PseudoQueue.enqueue("A");
        PseudoQueue.enqueue("B");
        PseudoQueue.enqueue("O");
        PseudoQueue.enqueue("U");
        PseudoQueue.enqueue("D");
        System.out.println(PseudoQueue);

        System.out.println("*------------------------------------*");


        System.out.println("Pop Start Here:");
        System.out.println(PseudoQueue.dequeue());
        System.out.println(PseudoQueue.dequeue());
        System.out.println(PseudoQueue);
        System.out.println(PseudoQueue.dequeue());
        System.out.println(PseudoQueue.dequeue());
        System.out.println(PseudoQueue.dequeue());


    }

}
