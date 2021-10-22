package trees.karytree;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T> {

    Node<T> root = null;
    int node = 0;
    int k = 0;

    public KaryTree(int k) {
        if (k <= 1)
            k = 2;
        this.k = k;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        node++;
        if (isEmpty()) {
            root = newNode;
            return;
        }
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            Node<T> current = queue.remove();
            if (current.children.size() < k) {
                current.addChild(newNode);
                return;
            } else {
                queue.addAll(current.children);
            }
        }
    }

    public KaryTree<String> fizzBuzzTree(KaryTree<Integer> karyTree) {
        KaryTree<String> newTree = new KaryTree<>(karyTree.k);

        Queue<Node<Integer>> queue = new LinkedList<>();
        if (!karyTree.isEmpty()) {
            queue.add(karyTree.root);

            while (!queue.isEmpty()) {

                Node<Integer> current = queue.remove();

                String value;
                if (current.value % 3 == 0 && current.value % 5 == 0)
                    value = "FizzBuzz";
                else if ((int) current.value % 3 == 0)
                    value = "Fizz";
                else if ((int) current.value % 5 == 0)
                    value = "Buzz";
                else
                    value = current.value.toString();

                newTree.insert(value);

                if (!current.children.isEmpty())
                    queue.addAll(current.children);
            }
        }
        return newTree;
    }

    public boolean isEmpty() {

        return root == null;
    }

    @Override
    public String toString() {
        return '[' + "" + root + ']';
    }
}