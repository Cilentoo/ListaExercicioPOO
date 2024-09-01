package com.poo.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao2() {
       /*3) Um banco contratou você para que escreva um programa que será utilizado
        pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
        cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
        das condições a seguir ele deve ser encaminhado para a fila preferencial. As
        condições são: Ter mais de 65 anos, se deficiente ou gestante.*/

        Scanner sc = new Scanner(System.in);
        String nome;
        String condicao;
        int idade;

        System.out.println("Olá seja bem-vindo ao BB, por favor digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Por favor, me diga se você possui alguma condição especial Gestante/Deficiência: ");
        condicao = sc.next();

        System.out.println("Ótimo " + nome +
                " agora por favor, digite sua idade: ");
        idade = sc.nextInt();


        if (idade > 65 || condicao.equals("Gestante") || condicao.equals("Deficiência")) {
            System.out.println("Ótimo, dirija-se a fila preferencial!");
        }else {
            System.out.println("Ótimo, dirija-se a fila comum!");
        }

        sc.close();
    }
}

