package Graph;

public class Stack {
    private int size;
    private int[] intArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        intArray = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(int data) {
        if(!isFull())
            intArray[++top] = data;
        else
            System.out.println("Cannot add data. Stack is full.");
    }

    public int pop() {
        return intArray[top--];
    }

    public int peek() {
        return intArray[top];
    }
}
