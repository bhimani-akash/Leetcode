package Graph;

public class Graph {
    private final int MAX = 20;
    private Vertex lastVertices[];
    private int adjMatrix[][];
    private int vertexCount;

    private Stack stack;
    private Queue queue;

    public Graph() {
        lastVertices = new Vertex[MAX];
        adjMatrix = new int[MAX][MAX];
        vertexCount = 0;
        stack = new Stack(MAX);
        queue = new Queue(MAX);

        for (int j = 0; j < MAX; j++) {
            for (int k = 0; k < MAX; k++) {
                adjMatrix[j][k] = 0;
            }
        }
    }

    public void addVertex(char label) {
        lastVertices[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void displayVertex(int vertexIndex) {
        System.out.print(lastVertices[vertexIndex].label + " ");
    }

    public int getAdjUnvisitedVertex(int vertexIndex) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[vertexIndex][i] == 1 && !lastVertices[i].visited)
                return i;
        }
        return -1;
    }

    public void depthFirstSearch() {
        lastVertices[0].visited = true;
        displayVertex(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int unvisitedVertex = getAdjUnvisitedVertex(stack.peek());

            if (unvisitedVertex == -1) {
                stack.pop();
            } else {
                lastVertices[unvisitedVertex].visited = true;
                displayVertex(unvisitedVertex);
                stack.push(unvisitedVertex);
            }
        }

        for (int i = 0; i < vertexCount; i++) {
            lastVertices[i].visited = false;
        }
    }

    public void breathFirstSearch() {
        lastVertices[0].visited = true;
        displayVertex(0);
        queue.insert(0);
        int unvisitedVertex;

        while (!queue.isEmpty()) {
            int tempVertex = queue.remove();

            while ((unvisitedVertex = getAdjUnvisitedVertex(tempVertex)) != -1) {
                lastVertices[unvisitedVertex].visited = true;
                displayVertex(unvisitedVertex);
                queue.insert(unvisitedVertex);
            }
        }

        for (int i = 0; i < vertexCount; i++) {
            lastVertices[i].visited = false;
        }
    }
}
