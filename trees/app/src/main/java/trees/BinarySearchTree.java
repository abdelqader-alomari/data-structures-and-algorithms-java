package trees;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    private Node<T> root;

    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            insert(data, root);
        }
    }

    private void insert(T data, Node<T> root) {
        Node<T> node = new Node<>(data);
        if (data.compareTo(root.getData()) == 0) System.out.println("The node is already exist");
        if (data.compareTo(root.getData()) < 0) {
            if (root.getLeft() == null) {
                root.setLeft(node);
            } else {
                insert(data, root.getLeft());
            }
        } else if (data.compareTo(root.getData()) > 0) {
            if (root.getRight() == null) {
                root.setRight(node);
            } else {
                insert(data, root.getRight());
            }
        }
    }
    public Node<T> getRoot() {
        return root;
    }


    public boolean contains(T data) {
        return contains(root, data);
    }

    private boolean contains(Node<T> root, T data) {
        if (root == null) {
            return false;
        }
        if (data == root.getData()) {
            return true;
        }
        T current = root.getData();
        return data.compareTo(current) < 0
                ? contains(root.getLeft(), data)
                : contains(root.getRight(), data);
    }
}