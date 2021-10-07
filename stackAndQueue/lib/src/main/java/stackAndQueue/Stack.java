package stackAndQueue;

public class Stack<I extends Number> {
     private Node top;

    public void push(String data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public String  pop() {
        if (isEmpty()) {
            return "The stack is empty";
        } else {
            String data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public String peek() {
        if (isEmpty()) {
            return "The stack is empty";
        } else {
            return top.getData();
        }
    }

    public boolean isEmpty(){
        if (top == null) return true;
        return false;
    }

    @Override
    public String toString() {
        if (top == null) return "null";
        String output = "Top = ";
        Node current = top;
        while (current != null){
            output += current.data+ " -> ";
            current = current.next;
        }
        output += "Null";
        return output;
    }

}
