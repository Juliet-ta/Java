package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Coordinates: ");
        float x = name.nextFloat();
        float y = name.nextFloat();
        if (x >= -1 && x <= 1 && y >= -1 && y <= 1)
            System.out.print("True");
        else
            System.out.print("False");
    }
}
