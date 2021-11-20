package Queue;

import java.util.NoSuchElementException;

public class Queue {
    int[] queue;
    int front;
    int back;

    public Queue(int capacity) {
        queue = new int[capacity];
    }

    public int size() {
        return back - front;
    }

    public void add(int data) {
        if (back == queue.length) {
            int[] newQueue = new int[2 * queue.length];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }
        queue[back] = data;
        back++;
    }

    public int remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        int remove = queue[front];
        queue[front] = -1;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return remove;
    }

    public int peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
