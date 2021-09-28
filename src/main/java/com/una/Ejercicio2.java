package com.una;

import java.util.Stack;

public class Ejercicio2 {
    public <T> T at(Stack<T> s1, int pos) {
        if (s1.size() > pos) {
            T val = null;
            Stack<T> s2 = new Stack<>();
            while (s1.size() > pos) {
                s2.push(s1.pop());
            }
            val = s1.pop();
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
            return val;
        }
        throw new RuntimeException("stack not big enough");
    }
}
