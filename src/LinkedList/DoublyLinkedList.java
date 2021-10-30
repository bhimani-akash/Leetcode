package LinkedList;

public class DoublyLinkedList {
    private DoublyLink first;
    private DoublyLink last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int key, int data) {
        DoublyLink link = new DoublyLink(key, data);

        if (isEmpty()) {
            last = link;
        } else {
            first.prev = link;
        }

        link.next = first;
        first = link;
    }

    public void insertLast(int key, int data) {
        DoublyLink link = new DoublyLink(key, data);

        if (!isEmpty()) {
            last.next = link;
            link.prev = last;
        }
        last = link;
    }

    public void displayForward() {
        DoublyLink current = first;

        System.out.print("[ ");
        while (current != null) {
            current.display();
            current = current.next;
            System.out.print(" ");
        }
        System.out.print("]");
    }

    public void displayBackward() {
        DoublyLink current = last;

        System.out.print("[ ");
        while (current != null) {
            current.display();
            current = current.prev;
            System.out.print(" ");
        }
        System.out.print("]");
    }

    public DoublyLink deleteFirst() {
        DoublyLink tempLink = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }

        first = first.next;
        return tempLink;
    }

    public DoublyLink deleteLast() {
        DoublyLink tempLink = last;

        if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
        }

        last = last.prev;
        return tempLink;
    }

    public boolean insertAfter(int key, int newKey, int data){
        DoublyLink current = first;

        if (first == null) {
            return false;
        }

        while (current.key != key) {
            if (current.next == null) {
                return false;
            } else {
                current = current.next;
            }
        }

        DoublyLink newLink = new DoublyLink(newKey, data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.prev = newLink;
        }

        newLink.prev = current;
        current.next = newLink;
        return true;
    }

    public DoublyLink delete(int key) {
        DoublyLink current = first;

        if (first == null) {
            return null;
        }

        while (current.key != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }

        if (current == first) {
            first = current.next;
        } else {
            current.prev.next = current.next;
        }

        if(current == last) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }

        return current;
    }
}
