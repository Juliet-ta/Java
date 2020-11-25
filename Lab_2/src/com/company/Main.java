package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circ = new Circle(0, 0, 5);
        Circle circ2 = new Circle(5, 0, 5);
        System.out.printf("Circle length = %s \n", circ.length());
        System.out.printf("Circle area = %s \n", circ.area());
        System.out.printf("Is belong point: %s \n", circ.isBelong(0.5, 0.5));
        System.out.printf("Is belong point: %s \n", circ2.isBelong(-10, 0));
        System.out.printf("Same points count: %s \n", circ.crossCirclePoints(circ2));
    }
}
