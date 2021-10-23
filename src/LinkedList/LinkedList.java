package LinkedList;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public void insertFirst(int key, int data) {
        Link link = new Link(key, data);
        link.next = first;
        first = link;
    }

    public Link deleteFirst() {
        Link tempLink = first;
        first = first.next;
        return tempLink;
    }

    public void display() {
        Link current = first;
        System.out.println("[ ");
        while (current.next != null) {
            current.display();
            current = current.next;
            System.out.println(" ");
        }
        System.out.println(" ]");
    }

    public Link find(int key) {
        Link current = first;

        if (first == null) return null;

        while (current.key != key) {
            if (current.next == null) return null;
            else current = current.next;
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = null;

        if (first == null) return null;

        while (current.key != key) {
            if (current.next == null) return null;
            else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) first = first.next;
        else previous.next = current.next;

        return current;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int length() {
        int length = 0;
        for (Link current = first; current != null; current = current.next)
            length++;
        return length;
    }
}
