package LinkedList;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(1,10);
        list.insertFirst(2,20);
        list.insertFirst(3,30);

        list.insertLast(4,40);
        list.insertLast(5,50);
        list.insertLast(6,60);

        System.out.println("List (First to Last):");
        list.displayForward();

        System.out.println("\n\nList (Last to First):");
        list.displayBackward();

        DoublyLink temp1 =  list.deleteFirst();
        System.out.print("\n\nDeleted first record: ");
        temp1.display();
        System.out.println("\nList after deleting first record: ");
        list.displayForward();

        DoublyLink temp2 = list.deleteLast();
        System.out.print("\n\nDeleted last record: ");
        temp2.display();
        System.out.println("\nList after deleting last record: ");
        list.displayForward();

        boolean inserted = list.insertAfter(4, 7, 13);
        if (inserted) {
            System.out.print("\n\nList, insert after key(4):\n ");
            list.displayForward();
        } else {
            System.out.print("\n\nkey(4) not found");
        }

        DoublyLink temp3 = list.delete(4);
        System.out.print("\n\nDeleted record: ");
        temp3.display();
        System.out.print("\nList, after delete key(4):\n");
        list.displayForward();
    }
}
