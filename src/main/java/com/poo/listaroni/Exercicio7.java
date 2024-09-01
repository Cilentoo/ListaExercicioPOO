package com.poo.listaroni;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int numero1;
        int numero2;

        System.out.println("Leia o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Leia o segundo numero: ");
        numero2 = sc.nextInt();

        System.out.println("Dividendo: " + numero1 + " Divisor: " + numero2 + " Quociente: " + (numero1/numero2) + " Resto: " + (numero1 % numero2));





        sc.close();
    }

}
