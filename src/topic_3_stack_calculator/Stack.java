package topic_3_stack_calculator;

public class Stack<T> {
    private int maxSize;
    private Object[] stackArray; // Change to Object array for generics
    private int top;
    
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new Object[maxSize];
        this.top = -1; 
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public int size() {
        return top + 1;
    }
    
    public void push(T value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cannot push " + value);
        }
        stackArray[++top] = value;
    }
     
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return (T) stackArray[top];
    }
     
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return (T) stackArray[top--];
    }
}