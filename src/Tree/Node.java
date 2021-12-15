package Tree;

public class Node {
    public int data;
    public Node leftChild;
    public Node rightChild;

    public Node() { }

    public void display() {
        System.out.print("(" + data + ")");
    }
}
