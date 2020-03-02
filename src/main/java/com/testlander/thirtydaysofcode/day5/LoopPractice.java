package com.testlander.thirtydaysofcode.day5;

public class LoopPractice {
    public static void practiceWhileLoop() {
        int x = 0;

        while (x < 5) {
            System.out.println("The value of X is: " + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of X is: " + x);
            x++;
        } while (x < 10);
    }

    public static void practiceForLoop() {
        for (int i = 0; i < 20; i++) {
            System.out.println("The value of X is: " + i);

        }
        System.out.println("this is the end!");
    }
    public static void main(String[] args) {
        //practiceWhileLoop();
        //practiceDoWhileLoop();
        practiceForLoop();
    }
}
