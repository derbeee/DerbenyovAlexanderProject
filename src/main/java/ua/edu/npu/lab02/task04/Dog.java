package ua.edu.npu.lab02.task04;

public class Dog {
    public static void main(String[] args) {
        Pet dog1 = new Pet("яко", 12);
        Pet dog2 = new Pet();
        Dog dog = new Dog();
        dog.talk();
        dog.walking();
    }


    public void talk() {
        System.out.println("woof-woof");
    }


    public void walking() {
        System.out.println("I go");
    }
}
