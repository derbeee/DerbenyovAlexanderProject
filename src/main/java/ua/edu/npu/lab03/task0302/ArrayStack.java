package ua.edu.npu.lab03.task0302;

public class ArrayStack implements Stack{
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(6);
        stack.push(4);
        stack.push(1);
        stack.push(54);
        stack.isEmpty();
        stack.pop();
        stack.size();

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        stack.clear();
    }

    public int mSize;
    public int top;
    public int[] array;

    public ArrayStack(int s) {
        this.mSize = s;
        array = new int[mSize];
        top = -1;
    }

    public void push(int data) {
        int i = ++ top;
        array[i] = data;
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            return array[top--];
        }
    }


    public boolean isEmpty() {
        return (top == -1);
    }


    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }


    public int size() {
        int size = top+1;
        return (size);
    }
}
