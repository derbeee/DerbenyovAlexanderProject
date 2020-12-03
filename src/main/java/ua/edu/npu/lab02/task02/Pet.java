package ua.edu.npu.lab02.task02;

public abstract class Pet {
    String name;
    int age;

    Pet() {
        name = "unknown";
        age = 0;
    }
    public Pet(String n, int a) {
        name = n;
        age = a;
    }
}
