/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    public void addNode(){

        Graph graph = new Graph();

        graph.addNode("Fellow 1");
        graph.addNode("Fellow 2");
        graph.addNode("Fellow 3");
        graph.addNode("Fellow 4");

        assertNotNull(graph.getNodes());
        assertEquals(4, graph.size());
    }

    @Test
    public void addEdge(){

        Graph graph = new Graph();

        graph.addNode("Fellow 1");
        graph.addNode("Fellow 2");

        graph.addEdge("Fellow 1", "Fellow 2");

        assertEquals("Fellow 1 is connected to [Fellow 2]", graph.print());
    }

    @Test
    public void NodeNeighbors(){

        Graph graph = new Graph();

        graph.addNode("Fellow 1");
        graph.addNode("Fellow 2");
        graph.addNode("Fellow 3");

        graph.addEdge("Fellow 1", "Fellow 2");
        graph.addEdge("Fellow 2", "Fellow 1");
        graph.addEdge("Fellow 3", "Fellow 2");

        assertEquals("[Fellow 2]", graph.getNeighbors("Fellow 1").toString());
        assertEquals("[Fellow 1]", graph.getNeighbors("Fellow 2").toString());

    }

    @Test
    public void oneNodeAndOneEdge(){

        Graph graph = new Graph();

        graph.addNode("Fellow 1");

        graph.addEdge("Fellow 1","Fellow 1");

        assertEquals("Fellow 1 is connected to [Fellow 1]", graph.print());
    }

    @Test
    public void emptyGraph(){

        Graph graph = new Graph();

        assertEquals(0, graph.size());

        assertEquals("[]", graph.getNodes().toString());
    }
    @Test
    public void breadthFirst(){

        Graph graph = new Graph();

        graph.addNode("Pandora");
        graph.addNode("Arendelle");
        graph.addNode("Metroville");
        graph.addNode("Monstroplolis");
        graph.addNode("Narnia");
        graph.addNode("Naboo");

        graph.addEdge("Pandora", "Arendelle");
        graph.addEdge("Arendelle", "Metroville");
        graph.addEdge("Arendelle", "Monstroplolis");
        graph.addEdge("Metroville", "Narnia");
        graph.addEdge("Metroville", "Naboo");
        graph.addEdge("Metroville", "Monstroplolis");
        graph.addEdge("Monstroplolis", "Naboo");
        graph.addEdge("Narnia", "Naboo");

        assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]", graph.breadthFirst_traversal("Pandora").toString());
    }

    @Test
    public void breadthFirstOneVertex(){

        Graph graph = new Graph();

        graph.addNode("Pandora");
        assertEquals("[Pandora]", graph.breadthFirst_traversal("Pandora").toString());
    }

    @Test
    public void breadthFirstTest(){

        Graph graph = new Graph();

        graph.addNode("Pandora");
        graph.addNode("Arendelle");
        graph.addNode("Metroville");

        graph.addEdge("Pandora", "Arendelle");

        assertEquals("[Pandora, Arendelle]", graph.breadthFirst_traversal("Pandora").toString());
    }


}
