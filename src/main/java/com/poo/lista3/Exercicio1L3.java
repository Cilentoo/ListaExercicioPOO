package com.poo.lista3;

import java.util.Scanner;

public class Exercicio1L3 {
    public static void resolucao4() {
        /*1) Escreva um programa que sirva como um cronômetro. O usuário deve
        digitar um numero em segundos e o programa deve contabilizar os segundos
        digitados. O programa deve receber somente números entre 1 e 59, do
        contrário ele retornar um erro e solicitar que o usuário digite um número válido.*/

        Scanner sc = new Scanner(System.in);
        int seconds;

        System.out.println("Enter the number" +
                " in seconds you want the program to count between 1 and 59");
        seconds = sc.nextInt();
        if (seconds < 1 || seconds >59){
            System.out.println("Error");
        }else {
            for (int timer = 0; timer < seconds; timer++) {
                try {
                    System.out.println("Segundo " + (timer + 1));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        sc.close();
    }
}
