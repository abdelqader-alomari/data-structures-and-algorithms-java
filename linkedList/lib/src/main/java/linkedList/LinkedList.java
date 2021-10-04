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
        }
    }

    public void insertBefore(String data,String before) {
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
        }

    }

    public void insertAfter(String data , String after){
        Node node = new Node(after);
        if (head == null) {
            head = node;
        }else {
            Node temp = head;
            while (temp.getData() != data) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }


}
