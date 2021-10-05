package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void instantiateLinkedList() {
        LinkedList Test = new LinkedList();
        assertNull(Test.head);
    }

    @Test
    void canInsert() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        String expected = "{ 100 } -> { 50 } -> { 20 } -> NULL";
        assertEquals(expected, Test.toString());
    }

    @Test
    void headPointsRight() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        assertEquals("100", Test.head.getData());
    }

    @Test
    void canInsertMultiple() {
        LinkedList Test = new LinkedList();
        Test.insert("10");
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        String expected = "{ 100 } -> { 50 } -> { 20 } -> { 10 } -> NULL";
        assertEquals(expected, Test.toString());
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

    @Test
    public void isEmptyTest() {
        LinkedList testList = new LinkedList();
    }

    @Test
    public void addAtEnd() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("80");
        Test.append("100");
        String expected = "{ 80 } -> { 50 } -> { 20 } -> { 100 } -> NULL";
        assertEquals(expected, Test.toString());
    }

    @Test
    public void addBefore() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        Test.insertBefore("50", "70");
        String expected = "{ 100 } -> { 70 } -> { 50 } -> { 20 } -> NULL";
        assertEquals(expected, Test.toString());
    }

    @Test
    public void addAfter() {

        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        Test.insertAfter("50", "30");
        String expected = "{ 100 } -> { 50 } -> { 30 } -> { 20 } -> NULL";
        assertEquals(expected, Test.toString());
    }

    @Test
    public void kth2() {
        LinkedList Test = new LinkedList();
        Test.insert("50");
        Test.insert("70");
        assertEquals("Exception", Test.linkedListKth(2));
    }

    @Test
    public void linkedListKth() {
        LinkedList Test = new LinkedList();

        Test.append("T");
        Test.append("o");
        Test.append("d");
        Test.append("a");
        Test.append("y");
        Test.append("5/10");
        Test.append("W");
        Test.append("e");
        Test.append("h");
        Test.append("a");
        Test.append("v");
        Test.append("e");
        Test.append("");
        Test.append("B");
        Test.append("i");
        Test.append("r");
        Test.append("t");
        Test.append("h");
        Test.append("d");
        Test.append("a");
        Test.append("y");
        Test.append("P");
        Test.append("a");
        Test.append("r");
        Test.append("t");
        Test.append("y");
        assertEquals("5/10", Test.linkedListKth(19));
    }

    @Test
    public void kthhappyPath() {
        LinkedList Test = new LinkedList();
        Test.insert("Happy Path");
        Test.insertAfter("Happy Path", "Regular Path");
        Test.insert("Bad Path");

        assertEquals("Happy Path", Test.linkedListKth(1));
    }

    @Test
    public void linkedListZip() {
        LinkedList list1 = new LinkedList();
        list1.append("1");
        list1.append("3");
        list1.append("5");


        LinkedList list2 = new LinkedList();
        list2.append("2");
        list2.append("4");

        LinkedList newList = new LinkedList();
        newList = newList.zip(list1,list2);
        System.out.println(newList);

        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> NULL", newList.zip(list1,list2).toString());
    }

}
