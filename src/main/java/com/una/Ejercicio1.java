package com.una;

import java.util.Stack;

public class Ejercicio1 {
    public <T extends Number & Comparable<? super T>> void ordenar(Stack<T> s1) {
        Stack<T> s2 = new Stack<>();
        while (!s1.isEmpty()) {
            T tmp = s1.pop();
            while (!s2.isEmpty() && s2.peek().compareTo(tmp) > 0) {
                s1.push(s2.pop());
            }
            s2.push(tmp);
        }
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }
}
