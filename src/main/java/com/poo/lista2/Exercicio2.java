package com.poo.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao2() {
        /* 2) Desenvolva um algoritmo que seja capaz de receber dois números digitados
        pelo usuário e diga qual deles é maior.*/

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Esccreva o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Esccreva o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("O número: " + n1 + " é maior!");
        }else {
            System.out.println("O número: " + n2 + " é maior!");
        }

        sc.close();
    }
}
