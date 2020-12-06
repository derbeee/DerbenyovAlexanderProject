package ua.edu.npu.lab01.task06;

public class Dog {
    int age;
    String name;
    public Dog() {
        age = 0;
        name = "незнайомець";
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    public Dog(int age, String name) {
        age =age;
        name =name;
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);

    }
}
