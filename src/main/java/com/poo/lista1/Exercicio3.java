package com.poo.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double valorEmReal;
        double dolar = 5.25;

        System.out.println("Escreva o valor em real: ");
        valorEmReal = sc.nextDouble();

        System.out.printf("O valor em dolar é: $ %.2f " , dolar * valorEmReal);


        sc.close();
    }
}
