package linkedList;

public class LinkedList {
    Node head;
    private int size;

    public void insert(String value) {
        if (head == null) {
            head = new Node(value);
            size++;
        } else {
            Node newNode = new Node(value);
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public String toString() {
        String result = "";
        if (head == null) {
            result = new String("List is empty");
        } else {
            Node current;
            current = head;

            while (current != null) {
                result += "{ " + current.getData() + " } -> ";

                current = current.getNext();
            }

            result += ("NULL");
        }
        return result;

    }

    public boolean includes(String data) {
        Node current = head;
        while (current != null) {
            if (data.equals(current.getData())) {
                return true;
            }
            current = current.getNext();
        }
        return false;

    }

}
