package ua.edu.npu.lab01.task06;

public class Application {
    public static void main(String[] args) {




        System.out.println(" class Detaill: ");
        Detail detaill = new Detail();
        detaill.accessToData();
        detaill.toData(05,05,2020);


        System.out.println(" class Statistic: ");
        Statistic statistic = new Statistic();
        statistic.reedArray();
        statistic.addingResult();
        statistic.maxAndMinElement();
        statistic.averageValue();
        statistic.modaResult();
        statistic.median();
        statistic.lassAverage();



        System.out.println(" class Dog: ");
        Dog dog = new Dog();
        Dog dog1 = new Dog(12, "Антон");

    }


}

