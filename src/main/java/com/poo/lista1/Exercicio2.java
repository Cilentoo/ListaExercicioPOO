package com.poo.lista1;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome;
        String sobrenome;

        System.out.println("Escreva seu nome: ");
        nome = sc.nextLine();

        System.out.println("Escreva seu sobrenome");
        sobrenome = sc.nextLine();

        System.out.println("Olá: "+ nome + " " + sobrenome + " !");

        sc.close();
    }
}
