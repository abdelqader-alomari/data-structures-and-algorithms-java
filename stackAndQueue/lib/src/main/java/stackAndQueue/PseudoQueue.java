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

    public class AnimalShelter {

        Queue cat = new Queue();
        Queue dog = new Queue();

        public void enqueue(Animal animal) {

            if (animal instanceof Cat) {
                cat.enqueue(animal.getPref());
            } else if (animal instanceof Dog) {
                dog.enqueue(animal.getPref());
            } else {
                System.out.println("Animal Shelter holds only dogs and cats.");
            }
        }

        public String dequeue(String pref) {

            if (pref.equals("cat") && !cat.isEmpty()) {
                return cat.dequeue();
            } else if (pref.equals("dog") && !dog.isEmpty()) {
                return dog.dequeue();
            } else {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "PseudoQueue{" + "stackTwo=" + stackTwo + '}';
    }
}
