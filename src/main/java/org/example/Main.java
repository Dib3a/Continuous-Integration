package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operation (add, subtract, multiply, divide):");
        String operation = scanner.nextLine();

        System.out.println("Enter first number:");
        double a = scanner.nextDouble();

        System.out.println("Enter second number:");
        double b = scanner.nextDouble();

        try {
            double result = Calculator.calculate(a, b, operation); // Corrected method call
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
