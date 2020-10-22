package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Coordinates A: ");
        float x1 = name.nextFloat();
        float y1 = name.nextFloat();
        System.out.print("Coordinates B: ");
        float x2 = name.nextFloat();
        float y2 = name.nextFloat();
        System.out.print("Distance between points: ");
        System.out.println(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
}
