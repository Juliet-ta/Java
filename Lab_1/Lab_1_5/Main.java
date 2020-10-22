package com.company;

public class Main {

    public static void main(String[] args) {
        result();
    }

    public static void result() {
        double f0, f1, EPS = 0.01, x = 0;
        f0 = x - Math.sin(x) - 1;
        f1 = x - Math.sin(x + 1);
        for (x += EPS; (((f0 < 0) && (f1 < 0)) || ((f0 > 0) && (f1 > 0))); x += EPS) {
            f0 = x - Math.sin(x) - 1;
            f1 = (x + EPS) - Math.sin(x + EPS) - 1;
        }
        System.out.println(x - EPS);
    }
}
