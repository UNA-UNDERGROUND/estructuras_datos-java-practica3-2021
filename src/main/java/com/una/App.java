package com.una;

import java.util.Stack;

public class App {
    Integer[] v = { 23, 56, 46, 41, 56, 30, 47, 23 };
    public void test1(){
        Stack<Integer> stack = new Stack<>();
        for (Integer i : v) {
            stack.push(i);
        }
        new Ejercicio1().ordenar(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        App app = new App();
        System.out.println("test 1");
        app.test1();
    }
}
