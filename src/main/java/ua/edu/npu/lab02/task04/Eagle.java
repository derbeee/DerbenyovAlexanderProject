package ua.edu.npu.lab02.task04;

public class Eagle implements Flying {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.talk();
        eagle.walking();
    }

    public void fly() {
        System.out.println("I fly");
    }


    public void talk() {
        System.out.println("kar-kar-kar");
    }


    public void walking() {
        System.out.println("I go");
    }
}
