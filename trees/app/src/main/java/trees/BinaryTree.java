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
}