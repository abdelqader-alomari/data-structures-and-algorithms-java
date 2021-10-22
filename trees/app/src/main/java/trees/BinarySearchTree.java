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
        if (data.compareTo(root.getData()) == 0)
            System.out.println("The node is already exist");
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
        return data.compareTo(current) < 0 ? contains(root.getLeft(), data) : contains(root.getRight(), data);
    }

    static <T> void oddNode(Node root) {
        if (root != null) {
            oddNode(root.getLeft());

            // if node is odd then print it
            if (root.key % 2 != 0)
                System.out.print(root.key + " ");

            oddNode(root.getRight());
        }

    }

    public int calculateSum(Node temp) {
        int sum, sumLeft, sumRight;
        sum = sumRight = sumLeft = 0;

        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        } else {
            if (temp.getLeft() != null)
                oddNode(temp.getLeft());
            sumLeft = calculateSum(temp.getLeft());

            if (temp.getRight() != null)
                sumRight = calculateSum(temp.getRight());

            sum = temp.key + sumLeft + sumRight;
            return sum;
        }
    }

}