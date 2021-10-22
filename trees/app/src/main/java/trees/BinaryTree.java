package trees;

import java.util.*;

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

    public List<T> breadthFirst(BinarySearchTree<T> newTree) {
        List<T> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(getRoot());
        while (!queue.isEmpty()) {
            Node newNode = queue.remove();
            result.add((T) newNode.getData());
            if (newNode.getLeft() != null) {
                queue.add(newNode.getLeft());
            }
            if (newNode.getRight() != null) {
                queue.add(newNode.getRight());
            }
        }
        return result;
    }

    public int oddSum(BinarySearchTree<T> newTree) {
        int sum = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(getRoot());
        if ((int) getRoot().getData() % 2 != 0) {
            sum = sum + (int) getRoot().getData();
        }

        while (!queue.isEmpty()) {
            Node newNode = queue.remove();
            if (newNode.getLeft() != null && (int) newNode.getLeft().getData() % 2 != 0) {
                queue.add(newNode.getLeft());
                sum += (int) newNode.getLeft().getData();
            }
            if (newNode.getRight() != null && (int) newNode.getRight().getData() % 2 != 0) {
                queue.add(newNode.getRight());
                sum += (int) newNode.getRight().getData();
            }
        }
        return sum;
    }

    // public int oddSum() {
    // List<T> list = new ArrayList<>();
    // int sum = 0;
    // BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    // list = (List<T>) binarySearchTree;
    // for (int i = 0; i < list.size(); i++) {
    // if ((int) list.get(i) % 2 != 0) {
    // sum += (int) list.get(i);
    // }
    // }
    // return sum;
    // }
}