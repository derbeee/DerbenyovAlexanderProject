package ua.edu.npu.lab02.task04;

public class Duck extends Pet implements Flying {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swimm();
        duck.talk();
        duck.walking();
    }

    public void fly() {
        System.out.println("I fly");
    }


    public void swimm() {
        System.out.println("I'm swimming");
    }


    public void talk() {
        System.out.println("quack-quack");
    }


    public void walking() {
        System.out.println("i go");
    }
}

