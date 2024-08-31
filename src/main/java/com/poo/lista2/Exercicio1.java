package com.poo.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao2() {
        /* 1) Escreva um programa que recebe um número digitado pelo usuário e responda
            se o número inserido é par ou ímpar ou 0.
         */
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero: ");
        n1 = sc.nextInt();

        if (n1 % 2 == 0){
            System.out.println("O número digitado é par!");
        }else {
            System.out.println("O número digitado é ímpar!");
        }

        sc.close();
    }
}
