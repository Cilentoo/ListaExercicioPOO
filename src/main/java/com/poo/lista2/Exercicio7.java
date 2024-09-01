package com.poo.lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao2() {
        /* 7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
        um determinado número informado pelo usuário é divisível por X (Que também
        deve ser informado pelo usuário)*/

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Digite um número: ");
        n1 = sc.nextInt();

        System.out.println("Digite um número: ");
        n2 = sc.nextInt();

        if(n1 % n2 == 0){
            System.out.println("O número " + n1 + " é divisível por " + n2);
        }else {
            System.out.println("Eles não são divisíveis.");
        }
        sc.close();
    }
}
