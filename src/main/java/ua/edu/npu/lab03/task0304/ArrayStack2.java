package ua.edu.npu.lab03.task0304;

import java.util.ArrayList;

public class ArrayStack2 implements Stack {

    public static ArrayList<Integer> a = new ArrayList();


    public void push(int data) {
        a.add(0, data);

    }


    public int pop() {
        a.remove(0);
        return a.get(0);
    }


    public int size() {
        return a.size();
    }


    public boolean isEmpty() {
        return a.isEmpty();
    }


    public void clear() {
        a.clear();
    }
}
