package trees.karytree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    public T value;
    public List<Node<T>> children = new ArrayList<>();

    public Node(T value) {
        this.value = value;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void addChild(Node<T> child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        result.append(value);
        result.append(" ");
        for (Node<T> ch : children) {
            result.append(" ");
            result.append(ch);
        }
        result.append(" ");

        return result.toString();
    }

}