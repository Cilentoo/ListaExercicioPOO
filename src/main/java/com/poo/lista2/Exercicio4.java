package com.poo.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao2() {
        /* 4) Um cliente que promove eventos e solicitou um programa que seja capaz de
        identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
        podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
        responsáveis. Maiores de 18 podem entrar normalmente.
         */
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Bem-vindo ao nosso sistema, digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Ótimo, agora digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 16 && idade <= 18){
            System.out.println("Entrada permitida apenas com acompanhamento dos país.");
        }else if(idade > 18){
            System.out.println("Entrada autorizada!");
        }else {
            System.out.println("Entrada não autorizada!");
        }

        sc.close();
    }
}
