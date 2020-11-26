package ua.edu.npu.lab01.task01;

import java.util.Scanner;

public class Statistic {
    int a = 9;
    int[] data;
    double f;

    public Statistic() {
        this.data = new int[this.a];
    }

    public void reedArray() {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the amount of data");
        this.a = reader.nextInt();

        for(int i = 0; i < this.data.length; ++i) {
            this.data[i] = reader.nextInt();
        }

    }

    public int addingResult() {
        int sum = 0;

        for(int i = 0; i < this.data.length; ++i) {
            sum += this.data[i];
        }

        System.out.println("adding a result:" + sum);
        return sum;
    }

    public void maxAndMinElement() {
        int max = this.data[0];

        int min;
        for(min = 0; min < this.data.length; ++min) {
            if (this.data[min] > max) {
                max = this.data[min];
            }
        }

        min = this.data[0];

        for(int i = 0; i < this.data.length; ++i) {
            if (this.data[i] < min) {
                min = this.data[i];
            }
        }

        System.out.println("maximum element: " + max);
        System.out.println("minimum element: " + min);
    }

    public void averageValue() {
        int sum2 = 0;

        for(int i = 0; i < this.data.length; ++i) {
            sum2 += this.data[i];
        }

        this.f = (double)(sum2 / this.data.length);
        System.out.println("average value: " + this.f);
    }

    public void modaResult() {
        int[] data2 = new int[this.data.length];

        int p;
        int i;
        for(p = 0; p <= this.data.length - 1; ++p) {
            for(i = 0; i <= this.data.length - 1; ++i) {
                if (this.data[p] == this.data[i]) {
                    int var10002 = data2[p]++;
                }
            }
        }

        p = 0;

        for(i = 0; i < this.data.length; ++i) {
            if (data2[i] > p) {
                p = data2[i];
            }
        }

        System.out.println("moda elements: " + data2[p]);
    }

    public void median() {
        int i;
        for(i = this.data.length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                if (this.data[j] > this.data[j + 1]) {
                    int tmp = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = tmp;
                }
            }
        }

        i = this.data.length / 2;
        int var10001;
        if (this.data.length % 2 == 0) {
            var10001 = this.data[i];
            --i;
            System.out.println("median:" + var10001 + ", " + this.data[i]);
        } else {
            var10001 = this.data[i];
            System.out.println("median: " + var10001);
        }

    }

    public void lassAverage() {
        int pm = 0;
        int pb = 0;

        for(int i = 0; i < this.data.length; ++i) {
            if (this.f > (double)this.data[i]) {
                ++pm;
            } else {
                ++pb;
            }
        }

        System.out.println("lass average: " + pm);
        System.out.println("more average: " + pb);
    }
}

