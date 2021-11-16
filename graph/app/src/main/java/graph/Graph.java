package graph;

import java.util.*;

public class Graph {
    private class Node {
        private String label;
        int weight;

        public Node(String label) {
            this.label = label;
        }

        public Node(String label, int weight) {
            this.label = label;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object object) {
            Node node = (Node) object;
            return Objects.equals(label, node.label);
        }

        @Override
        public int hashCode() {
            return Objects.hash(label);
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private Map<Node, List<Node>> adjacencyList = new HashMap<>();
    private Map<String, Node> nodes = new HashMap<>();

    public Node addNode(String value) {
        Node node = new Node(value);
        nodes.putIfAbsent(value, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
        return node;
    }

    public void addEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException("It's empty and this is not a valid node");
        Node toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException("It's empty and this is not a valid node");
        adjacencyList.get(fromNode).add(toNode);
        // adjacencyList.get(toNode).add(fromNode); // if we comment this will get uni
        // direct graph, otherwise it will become Indirect (with inverse relationship)
    }

    public Set<Node> getNodes() {
        return adjacencyList.keySet();
    }

    public List<Node> getNeighbors(String value) {
        Node collection = new Node(value);
        return adjacencyList.get(collection);
    }

    public int size() {
        return adjacencyList.size();
    }

    public String print() {
        var print = "";
        for (Node source : adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if (!targets.isEmpty()) {
                print += source + " is connected to " + targets;
            }
        }
        return print;
    }

    public Set<String> breadthFirst_traversal(String root) {
        Node node = nodes.get(root);
        if(node == null){
            return null;
        }
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Node n : getNeighbors(vertex)) {
                if (!visited.contains(n.label)) {
                    visited.add(n.label);
                    queue.add(n.label);
                }
            }
        }
        return visited;
    }

    public void addEdgeWithWeight(String data1, String data2, int weight) {
        Node Vertex1 = new Node(data1, weight);
        Node Vertex2 = new Node(data2, weight);


        adjacencyList.get(Vertex1).add(Vertex2);
        adjacencyList.get(Vertex2).add(Vertex1);
    }

    public String businessTrip(Graph graph, List<String> citiesNames) {
        int cost = 0;
        if (citiesNames.size() <= 1)
            return "null";

        int findWeight;
        for (int i = 0; i < citiesNames.size() - 1; i++) {
            findWeight = findWeight(graph, citiesNames.get(i), citiesNames.get(i + 1));

            if (findWeight == 0)
                return "False, $0";

            cost += findWeight;
        }
        return "True, $" + cost;
    }
    private int findWeight(Graph graph, String city1, String city2) {
        for (Node vertex : graph.getNeighbors(city1)) {
            if (Objects.equals(city2, vertex.label)) {
                return vertex.weight;
            }
        }
        return 0;
    }
}