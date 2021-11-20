package Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.add(3);
        queue.add(5);
        queue.add(9);
        queue.add(1);
        queue.add(12);
        System.out.print("After adding data : ");
        queue.printQueue();

        queue.remove();
        queue.remove();
        System.out.print("\nAfter removing data : ");
        queue.printQueue();

        System.out.println("\nPeeked data : " + queue.peek());
    }
}
