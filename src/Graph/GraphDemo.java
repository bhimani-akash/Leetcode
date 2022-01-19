package Graph;

public class GraphDemo {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(0,4);
        graph.addEdge(0,5);
        graph.addEdge(5,6);

        System.out.println("Dept First Search: ");

        graph.depthFirstSearch();

        System.out.println();
        System.out.println("Breath First Search: ");

        graph.breathFirstSearch();
    }
}
