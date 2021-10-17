package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private Node<T> root;
    private List<T> list = new ArrayList<>();

    public Node<T> getRoot() {
        return root;
    }

    public List<T> preOrder(Node<T> root) {
        list.add(root.getData());
        if (root.getLeft() != null) {
            preOrder(root.getLeft());
        }
        if (root.getRight() != null) {
            preOrder(root.getRight());
        }
        return list;
    }

    public List<T> inOrder(Node<T> root) {
        try {
            if (root.getLeft() != null) {
                inOrder(root.getLeft());
            }
            list.add(root.getData());
            if (root.getRight() != null) {
                inOrder(root.getRight());
            }
        } catch (Exception error) {
            System.out.println("Unexpected Error");
        }
        return list;
    }

    public List<T> postOrder(Node<T> root) {
        try {
            if (root.getLeft() != null) {
                postOrder(root.getLeft());
            }
            if (root.getRight() != null) {
                postOrder(root.getRight());
            }
            list.add(root.getData());
        } catch (Exception error) {
            System.out.println("Unexpected Error");
        }
        return list;
    }

//    public int maxValue(Node<T> node) {
//        if (node == null)
//            return 0;
//
//        int max = (int) node.getData();
//        System.out.println("root : " + max);
//        int left = maxValue(node.getLeft());
//        System.out.println("left : " + left);
//        int right = maxValue(node.getRight());
//        System.out.println("right : " + right);
//
//        if (left > max)
//            max = left;
//        if (right > max)
//            max = right;
//        return max;
//    }

    public int treeMax(){
        if (isEmpty()) {
            return 0;
        }
        int max = 0;
        ArrayList<T> maxArray = preOrder();
        for (int i = 0; i < maxArray.size(); i++) {
            if(Integer.parseInt(maxArray.get(i) + "") > max){
                max = Integer.parseInt(maxArray.get(i) + "");
            }
        }
        return  max;
    }



}