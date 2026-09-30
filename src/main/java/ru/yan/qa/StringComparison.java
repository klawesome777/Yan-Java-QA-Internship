package ru.yan.qa;

import java.util.Scanner;

public final class StringComparison {
    private StringComparison() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку a: ");
            String a = scanner.nextLine();

            System.out.print("Введите строку b: ");
            String b = scanner.nextLine();

            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        }
    }
}
