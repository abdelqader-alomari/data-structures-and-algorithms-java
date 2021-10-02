package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("100");
        list.insert("50");
        list.insert("20");

        System.out.println(list.toString());
        System.out.println(list.includes("20"));
    }
}
