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

        AnimalShelter animalShelter = new AnimalShelter();
        Animal cat1 = new Cat("katte");
        Animal cat2 = new Cat("luce");
        Animal cat3 = new Cat("ketty");
        Animal dog1 = new Dog("Tom");
        Animal dog2 = new Dog("Rex");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(cat3);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);

        System.out.println(animalShelter);

        animalShelter.dequeue("cat");
        System.out.println(animalShelter);

        animalShelter.dequeue("dog");
        System.out.println(animalShelter);
    }

}
