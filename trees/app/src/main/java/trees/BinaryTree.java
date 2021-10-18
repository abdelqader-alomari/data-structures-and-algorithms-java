package trees;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import static java.util.Collections.max;

public class BinaryTree<T extends Comparable<T>> {
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

    //
    public int treeMax(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        int max = root.getData();
        int left = treeMax(root.getLeft());
        int right = treeMax(root.getRight());

        if (left > max) {
            max = left;
        } else if (right > max) {
            max = right;
        }

        return max;
    }
//    int findMax(){
//        Stack<Node>stack = new Stack<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        Node current = root;
//        //inorderIterative
//        while(!stack.isEmpty() || current!=null){
//            if(current!=null){
//                stack.push(current);
//                current=current.getLeft();
//            }
//            else{
//                current=stack.pop();
//                list.add((Integer) current.getData());
//                current=current.getRight();
//            }
//        }
//        return Collections.max(list);
//    }


}