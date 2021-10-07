package stackAndQueue;

public class Queue {
    Node front;
    Node rear;

    public void enqueue(String data){
        Node node = new Node(data);
        if (front == null){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            String data = front.getData();
            front = front.getNext();
            return data;
        }
    }

    public String peek() {
        return front.getData();
    }

    public boolean isEmpty(){
        return front ==null;
    }

    @Override
    public String toString() {
        if (front == null) return "null";
        String result = "Queue:";
        Node current = front;
        while (current != null){
            result += " Node{" +
                    "data='" + current.data + '\'' +
                    '}';
            ;
            current = current.next;
        }
        return result;
    }
}
