package stackAndQueue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void stackPush() {
        Stack Test = new Stack();
        Test.push(50);
        String expected = "[50]";
        assertEquals(expected, Test.toString());
    }

    @Test
    void stackMultiPush() {
        Stack Test = new Stack();
        Test.push(10);
        Test.push(20);
        Test.push(50);
        Test.push(100);
        String expected = "[10, 20, 50, 100]";
        assertEquals(expected, Test.toString());
    }

    //
    @Test
    void stackPop() {
        Stack<Integer> test = new Stack<>();
        test.push(100);
        test.push(80);
        test.push(40);
        test.push(20);
        assertEquals(20, test.pop());
    }

    @Test
    void popsEmptyStack() {
        Stack<Integer> test = new Stack<>();
        test.push(100);
        test.push(50);
        test.push(20);
        test.pop();
        test.pop();
        test.pop();
        assertEquals("[]", test.toString());
    }

    @Test
    void stackPeek() {
        Stack<Integer> test = new Stack<>();
        test.push(100);
        test.push(80);
        test.push(50);
        test.pop();
        assertEquals(80, test.peek());
    }

    //
    @Test
    public void isEmptyTest() {
        Stack test = new Stack();
    }

    @Test
    void pushQueue() {
        Queue test = new Queue();
        test.enqueue("80");
        assertEquals("Queue: Node{data='80'}", test.toString());
    }

    // Can successfully enqueue multiple values into a queue
    @Test
    void pushMultipleQueue() {
        Queue test = new Queue();
        test.enqueue("100");
        test.enqueue("50");
        test.enqueue("20");
        assertEquals("Queue: Node{data='100'} Node{data='50'} Node{data='20'}", test.toString());
    }

    // Can successfully dequeue out of a queue the expected value
    @Test
    void enqueueQueue() {
        Queue test = new Queue();
        test.enqueue("100");
        test.enqueue("50");
        test.enqueue("20");
        assertEquals("100", test.dequeue());
    }

    @Test
    void peekQueue() {
        Queue test = new Queue();
        test.enqueue("80");
        test.enqueue("50");
        test.enqueue("20");
        assertEquals("80", test.peek());
    }

    @Test
    void emptyQueueEnDe() {
        Queue test = new Queue();
        test.enqueue("100");
        test.enqueue("50");
        test.dequeue();
        test.dequeue();
        test.dequeue();
        assertEquals("null", test.toString());
    }

    // Can successfully instantiate an empty queue
    @Test
    void emptyQueue() {
        Queue queueList = new Queue();
    }

    // Calling dequeue or peek on empty queue raises exception
    @Test
    void dequeueEmptyQueue() {
        Queue test = new Queue();
        assertNull(test.dequeue());
    }

    @Test
    void pseudoQueueEmpty() {
        PseudoQueue test = new PseudoQueue();
        assertEquals("The stack is empty", test.dequeue());
    }

    @Test
    void pseduQueueEnqueueDequeue() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue("100");
        test.enqueue("80");
        test.enqueue("60");
        test.enqueue("40");
        test.enqueue("20");

        assertEquals("100", test.dequeue());
        test.dequeue();
        assertEquals("60", test.dequeue());
    }

    @Test
    void dequeueAnimalShelter() {
        AnimalShelter test = new AnimalShelter();
        assertNull(test.dequeue(""));
    }

    @Test
    void AnimalShelterEnqueueDequeue() {
        AnimalShelter test = new AnimalShelter();
        Animal cat1 = new Cat("katte");
        Animal cat2 = new Cat("luce");
        Animal cat3 = new Cat("ketty");
        Animal dog1 = new Dog("Tom");
        Animal dog2 = new Dog("Rex");

        test.enqueue(cat1);
        test.enqueue(cat2);
        test.enqueue(cat3);
        test.enqueue(dog1);
        test.enqueue(dog2);

        assertEquals(
                "AnimalShelter{cat=Queue: Node{data='katte'} Node{data='luce'} Node{data='ketty'}, dog=Queue: Node{data='Tom'} Node{data='Rex'}}",
                test.toString());
        test.dequeue("cat");

        assertEquals(
                "AnimalShelter{cat=Queue: Node{data='luce'} Node{data='ketty'}, dog=Queue: Node{data='Tom'} Node{data='Rex'}}",
                test.toString());

        test.dequeue("dog");
        assertEquals("AnimalShelter{cat=Queue: Node{data='luce'} Node{data='ketty'}, dog=Queue: Node{data='Rex'}}",
                test.toString());

    }

    @Test
    public void validateBracketsTest() {

        StackAndQueueBrackets test = new StackAndQueueBrackets();

        assertTrue(test.bracketsValidation("{}")); // true
        assertFalse(test.bracketsValidation("{}}")); // false = false
        assertTrue(test.bracketsValidation("{}(){}")); // true
        assertTrue(test.bracketsValidation("()[[Extra Characters]]")); // true
        assertFalse(test.bracketsValidation("{(})")); // false = false
        assertTrue(test.bracketsValidation("(){}[[]]")); // true
        assertFalse(test.bracketsValidation("(](")); // false = false
        assertTrue(test.bracketsValidation("{}{Code}[Fellows](())")); // true

    }

}
