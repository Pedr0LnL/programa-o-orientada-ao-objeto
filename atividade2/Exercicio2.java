package atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int choice = scanner.nextInt();

        double result = 0.0;

        if (choice == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            result = (celsius * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + result);
        } else if (choice == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            result = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperatura em Celsius: " + result);
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
