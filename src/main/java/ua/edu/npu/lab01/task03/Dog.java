package ua.edu.npu.lab01.task03;
import java.util.Scanner;

public class Dog {
    int age;
    String name;
    Dog() {
        age = 0;
        name = "незнайомець";
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    Dog(int age, String name) {
        age =age;
        name =name;
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
    }

}
