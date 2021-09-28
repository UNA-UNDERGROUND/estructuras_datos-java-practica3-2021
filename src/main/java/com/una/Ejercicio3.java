package com.una;

public class Ejercicio3 {
    public Integer P(Integer n) {
        if (n < 0) {
            throw new RuntimeException("no se aceptan numeros negativos");
        }
        switch (n) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return P(n - 2) + P(n - 3);
        }
    }
}
