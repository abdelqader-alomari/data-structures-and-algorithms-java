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


    }
}
