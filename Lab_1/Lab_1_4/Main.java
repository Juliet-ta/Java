package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        int N = name.nextInt();
        int[] a = new int[N];
        int k = 0;
        int l = 0;
        for (int i = 0; i < N; i++)
            a[i] = name.nextInt();
        int min = Math.abs(a[0] - a[1]);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (a[i] - a[j] != 0 && min > Math.abs(a[i] - a[j])) {
                    min = Math.abs(a[i] - a[j]);
                    k = i;
                    l = j;
                }
        System.out.print(k + 1 + "; ");
        System.out.println(l + 1);
    }
}
