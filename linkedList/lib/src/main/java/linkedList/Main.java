package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Code 201");
        list.insert("Code 301");
        list.insert("Code 401");

        System.out.println(list.toString());
        System.out.println(list.includes("Code 301"));
    }
}
