package ua.edu.npu.lab02.task04;

public class Cat implements Talking, Walking {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.talk();
        cat.walking();
    }


    public void talk() {
        System.out.println("meow-meow");
    }


    public void walking() {
        System.out.println("i go");
    }
}

