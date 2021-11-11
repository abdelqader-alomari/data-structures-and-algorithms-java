package graph;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private class Node{
        private String label;

        public Node(String label) {
            this.label = label;
        }
    }
    private Map<String,Node> nodes = new HashMap<>();
    public void addNode (String label){
        Node node = new Node(label);
        nodes.putIfAbsent(label,node);
    }
}
