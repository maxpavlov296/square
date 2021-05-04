package com.company;

import java.util.Scanner;

public class Main {
    public static int digitNumber(int number, int position) {
        int result = 0;
        for (int i = 0; i < position; i++) {
            result = number % 10;
            number /= 10;
        }
        return result;
    }

    public static double square(int a, int b, int c) {
        int p;
        p = (int) (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double squarefive(int a, int b, int c, int d, int e, int f, int g) {
        return square(a, g, b) + square(f, g, c) + square(e, f, d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(square(5, 3, 4));
        System.out.println(squarefive(8, 2, 3, 4, 5, 6, 7));
        System.out.println(digitNumber(456 ,3));
    }
}
