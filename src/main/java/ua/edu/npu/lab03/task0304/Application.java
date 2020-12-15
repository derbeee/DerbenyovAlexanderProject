package ua.edu.npu.lab03.task0304;


public class Application {
    public static void main(String[] args) {
        ArrayStack arrayStack1 = new ArrayStack(85);
        ua.edu.npu.lab03.task0304.ArrayStack arrayStack2 = new ua.edu.npu.lab03.task0304.ArrayStack(0);
        arrayStack1.push(5);
        arrayStack1.push(74);
        arrayStack1.isEmpty();
        arrayStack1.pop();
        arrayStack1.size();
        arrayStack1.clear();

        arrayStack2.push(52);
        arrayStack2.push(57);
        arrayStack2.pop();
        arrayStack2.clear();
        arrayStack2.size();
        arrayStack2.isEmpty();
    }
}
