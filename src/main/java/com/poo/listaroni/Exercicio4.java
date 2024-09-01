package com.poo.listaroni;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao3() {
        Scanner sc = new Scanner (System.in);
        int ano_nascimento;
        int ano_futuro = 2035;

        System.out.println("Escreva o ano do seu nascimento: ");
        ano_nascimento = sc.nextInt();

        int resultado = ano_futuro - ano_nascimento;
        System.out.println("Sua idade em 2035 é: " + resultado );

        sc.close();
    }

}
