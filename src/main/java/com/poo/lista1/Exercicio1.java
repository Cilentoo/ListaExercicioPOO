package com.poo.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n1;
        int n2;

        System.out.println("Escreva o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Escreva o segundo número: ");
        n2 = sc.nextInt();

        System.out.println("O resultado da soma é: " + (n1+n2));


        sc.close();
    }
}
