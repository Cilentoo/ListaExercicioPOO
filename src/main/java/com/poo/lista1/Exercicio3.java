package com.poo.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        //3) Escreva uma calculadora que receba um valor em reais e
        //converta para dólar. Considere o valor do dólar a R$5,25

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double valorEmReal;
        double dolar = 5.25;

        System.out.println("Escreva o valor em real: ");
        valorEmReal = sc.nextDouble();

        System.out.printf("O valor em dolar é: $ %.2f ", dolar * valorEmReal);


        sc.close();
    }
}
