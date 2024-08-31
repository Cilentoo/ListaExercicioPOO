package com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao() {
        //4) Construa um algoritmo que leia um número inteiro na tela e
        //responda o número antecessor e o sucessor.

        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println("Escreva o número: ");
        num1 = sc.nextInt();

        System.out.println("Seu sucessor é: " + (num1 + 1));
        System.out.println("Seu antecessor é: " + (num1 - 1));

        sc.close();
    }
}
