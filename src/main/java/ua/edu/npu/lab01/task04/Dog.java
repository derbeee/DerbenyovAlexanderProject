package ua.edu.npu.lab01.task04;

public class Dog extends Application{
    private static int numb =0;
    public static int conter() {
        return numb;
    }
    int age;
    String name;
    Dog() {
        age = 0;
        name = "незнайомець";
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        numb++;
    }
    Dog(int age, String name) {
        age =age;
        name =name;
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        numb++;

        System.out.println("the number of objects created: " + numb);
    }
}
