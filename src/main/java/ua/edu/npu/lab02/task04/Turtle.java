package ua.edu.npu.lab02.task04;

public class Turtle implements Swimming, Walking {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.swimm();
        turtle.walking();
    }

    public void swimm() {
        System.out.println("I'm swimming");
    }


    public void walking() {
        System.out.println("I go");
    }
}

