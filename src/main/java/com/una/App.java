package com.una;

import java.util.Stack;

public class App {
    Integer[] v = { 23, 56, 46, 41, 56, 30, 47, 23 };

    public void test1() {
        Stack<Integer> stack = new Stack<>();
        for (Integer i : v) {
            stack.push(i);
        }
        new Ejercicio1().ordenar(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public void test2() {
        Stack<Integer> stack = new Stack<>();
        for (Integer i : v) {
            stack.push(i);
        }
        System.out.println(new Ejercicio2().at(stack, 2));
    }

    public void test3() {
        for (int n = 0; n < 128; n++) {
            System.out.println("P(" + n + ")=" + new Ejercicio3().P(n));
        }

    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("test 1");
        app.test1();
        System.out.println("test 2");
        app.test2();
        System.out.println("test 3");
        app.test3();
    }
}
