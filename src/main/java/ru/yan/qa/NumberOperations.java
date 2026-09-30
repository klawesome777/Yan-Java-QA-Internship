package ru.yan.qa;

import java.util.Scanner;

public final class NumberOperations {
    private NumberOperations() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите целое число a: ");
            int a = scanner.nextInt();

            System.out.print("Введите целое число b: ");
            int b = scanner.nextInt();

            printComparison(a, b);
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));

            if (b == 0) {
                System.out.println("a / b: деление на ноль невозможно");
            } else {
                System.out.println("a / b = " + (a / b));
            }

            System.out.println("a * b = " + (a * b));
        }
    }

    private static void printComparison(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
}
