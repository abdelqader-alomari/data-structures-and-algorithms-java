package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void instantiateLinkedList() {
        LinkedList MyTest = new LinkedList();
        assertNull(MyTest.head);
    }

    @Test
    void canInsert() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("20");
        MyTest.insert("50");
        MyTest.insert("100");
        String expected = "{ 100 } -> { 50 } -> { 20 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void headPointsRight() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("20");
        MyTest.insert("50");
        MyTest.insert("100");
        assertEquals("100", MyTest.head.getData());
    }

    @Test
    void canInsertMultiple() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("10");
        MyTest.insert("20");
        MyTest.insert("50");
        MyTest.insert("100");
        String expected = "{ 100 } -> { 50 } -> { 20 } -> { 10 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void LinkedListIncludes() {
        LinkedList ll = new LinkedList();
        ll.insert("100");
        ll.insert("50");
        ll.insert("20");
        assertTrue(ll.includes("50"));
    }

    @Test
    void LinkedListNotIncludes() {
        LinkedList ll = new LinkedList();
        ll.insert("100");
        ll.insert("50");
        ll.insert("20");

        assertFalse(ll.includes("30"));
        assertFalse(ll.includes("70"));
    }

    @Test
    void includesWorkingFine() {
        LinkedList ll = new LinkedList();
        ll.insert("20");
        ll.insert("50");
        ll.insert("100");

        String expected = "{ 100 } -> { 50 } -> { 20 } -> NULL";
        assertEquals(expected, ll.toString());
    }
}
