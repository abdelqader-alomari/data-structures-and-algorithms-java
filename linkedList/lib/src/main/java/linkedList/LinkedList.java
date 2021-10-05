package linkedList;

public class LinkedList {
    Node head;
    public Node current;
    private int size;

    public int getSize() {
        return size;
    }

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

    public void append(String data) {
        if (head == null) {
            Node node = new Node(data);
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Node node = new Node(data);
            current.setNext(node);
            size++;
        }
    }

    public void insertBefore(String data, String before) {
        Node node = new Node(before);
        if (head == null) {
            head = node;
        } else if (data == head.getData()) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            while (temp.next.getData() != data) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }

    }

    public void insertAfter(String data, String after) {
        Node node = new Node(after);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getData() != data) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }

    }

    public String linkedListKth(int k) {
        Node current = head;
        if (head == null) {
            System.out.println("The list is empty");
        }
        if (k > getSize() - 1 || k < 0) {
            return "Exception";
        }
        int i = 0;
        while (i < (getSize() - 1 - k)) {
            current = current.getNext();
            i++;
        }
        return current.getData();
    }

}