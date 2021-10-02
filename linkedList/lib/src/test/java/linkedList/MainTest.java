package linkedList;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //CodeChallenge05 Testing methods:
    @Test
    void instantiateLinkedList() {
        LinkedList MyTest = new LinkedList();
        assertNull(MyTest.head);
    }

    @Test
    void canInsert() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("a");
        MyTest.insert("b");
        MyTest.insert("c");
        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void headPointsRight() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("a");
        MyTest.insert("b");
        MyTest.insert("c");
        assertEquals("a", MyTest.head.getData());
    }

    @Test
    void canInsertMultiple() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("a");
        MyTest.insert("b");
        MyTest.insert("c");
        MyTest.insert("d");
        String expected = "{ a } -> { b } -> { c } -> { d } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void LinkedListIncludes() {
        LinkedList ll = new LinkedList();
        ll.insert("a");
        ll.insert("b");
        ll.insert("c");
        assertTrue(ll.includes("b"));
    }

    @Test
    void LinkedListDoesntIncludes() {
        LinkedList ll = new LinkedList();
        ll.insert("a");
        ll.insert("b");
        ll.insert("c");

        assertFalse(ll.includes("g"));
        assertFalse(ll.includes("i"));
    }

    @Test
    void includesWorkingFine() {
        LinkedList ll = new LinkedList();
        ll.insert("a");
        ll.insert("b");
        ll.insert("c");

        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals(expected, ll.toString());
    }
}
