package com.poo.lista3;

import java.util.Scanner;

public class Exercicio2L3 {
    public static void resolucao4() {
        /* 2) Desenvolva um programa que receba um número do usuário e escreva a
        tabuada dele.8 */

        Scanner sc = new Scanner(System.in);
        int number;
        int result;

        System.out.println("Enter the number to see the respective multiplication table: ");
        number = sc.nextInt();

        for (int i = 0; i<10; i++){
            result = number * i;
            System.out.println(number + "X" + i + "=" + result);
        }
        sc.close();
    }
}
