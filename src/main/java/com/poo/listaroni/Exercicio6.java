package com.poo.listaroni;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double celsius;
        double fahrenheit;

        System.out.println("Leia os graus celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = celsius * 1.8 + 32;
        System.out.printf("Fahrenheit: %.2f", fahrenheit);
        sc.close();
    }
}
