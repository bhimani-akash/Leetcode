package LinkedList;

public class DoublyLink {
    public int key;
    public int data;
    public DoublyLink next;
    public DoublyLink prev;

    public DoublyLink(int key, int data) {
        this.key = key;
        this.data = data;
    }

    public void display() {
        System.out.print("{" + key + "," + data + "}");
    }
}
