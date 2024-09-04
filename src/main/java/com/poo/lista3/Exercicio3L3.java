package com.poo.lista3;

import java.util.Scanner;

public class Exercicio3L3 {
    public static void resolucao4() {
        /* 3) Escreva um código que receba dois números inteiros e escreva todos os
        números pares entre eles. */

        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Send the first number: ");
        number1 = sc.nextInt();
        System.out.println("Send the second number: ");
        number2 = sc.nextInt();

        int min = Math.min(number1,number2);
        int max = Math.max(number1, number2);

        System.out.println("Even numbers between " + min + " and " + max + " : ");

        for (int i = min ; i < max; i++){
            if (i % 2 == 0){
                System.out.println(i + "");
            }
        }
        sc.close();
    }
}
