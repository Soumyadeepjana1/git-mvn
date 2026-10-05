package com.example;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     MAVEN DEMO APPLICATION");
        System.out.println("================================");

        int result = add(10, 20);

        System.out.println("10 + 20 = " + result);
        System.out.println("Application running successfully!");
    }
}
