package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("20");
        list.insert("50");
        list.insert("100");

        list.append("5");
        list.insertBefore("50", "10");
        list.insertAfter("20", "3");

        System.out.println(list.toString());
        System.out.println(list.includes("90"));
        System.out.println(list.linkedListKth(5));

    }
}
