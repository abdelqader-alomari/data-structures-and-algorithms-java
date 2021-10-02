package linkedList;

public class LinkedList {
    Node head;
    private int size;

    public void insert(String data){
        if(head == null){
            head= new Node(data);
            size++;
        }else {
            Node current = head ;
            while(current.getNext() != null){
                current = current.getNext();
            }
            Node node = new Node(data);
            current.setNext(node);
            size++;
        }
    }


    @Override
    public String toString() {
        String result="";
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
        while (current!=null) {
            if (data.equals(current.getData())) {
                return true;
            }
            current = current.getNext();
        }
        return false;

    }

}
