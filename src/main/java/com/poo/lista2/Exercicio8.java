package com.poo.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao2() {
        /* 8) Crie um joguinho de perguntas e respostas múltipla escolha. O programa
        deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo. Se
        o usuário chegar até o final o programa deve exibir o número de acertos.*/
        Scanner sc = new Scanner(System.in);
        int chances = 3;
        int pontuacao = 0;

        System.out.println("Seja bem-vindo ao gameshow de perguntas!");
        System.out.println("Qual destes animais é conhecido por sua inteligência excepcional?" +
                "\n" +
                "a) Gato\n" +
                "b) Cachorro\n" +
                "c) Golfinho\n" +
                "d) Elefante");
        char resposta1 = sc.next().toLowerCase().charAt(0);
        if (resposta1 == 'c'){
            pontuacao ++;
        }else {
            chances--;
            System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
        }

        if (chances > 0){
            System.out.println("Qual destes países é o maior do mundo em área territorial?" +
                    "\n" +
                    "a) Estados Unidos\n" +
                    "b) Rússia\n" +
                    "c) China\n" +
                    "d) Canadá");
            char resposta2 = sc.next().toLowerCase().charAt(0);
            if (resposta2 == 'b'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }
        if (chances > 0){
            System.out.println("Qual destes elementos químicos é o mais abundante na crosta terrestre?" +
                    "\n" +
                    "a) Carbono\n" +
                    "b) Litio\n" +
                    "c) Oxigênio\n" +
                    "d) Ferro");
            char resposta3 = sc.next().toLowerCase().charAt(0);
            if (resposta3 == 'c'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }
        if (chances > 0){
            System.out.println("Qual destes filmes ganhou o Oscar de Melhor Filme em 2023?" +
                    "\n" +
                    "a) Top Gun: Maverick\n" +
                    "b) Avatar: O Caminho da Água\n" +
                    "c) Elvis\n" +
                    "d) Tudo em Todo Lugar ao Mesmo Tempo");
            char resposta4 = sc.next().toLowerCase().charAt(0);
            if (resposta4 == 'd'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }
        if (chances > 0){
            System.out.println("Qual destes instrumentos musicais é considerado um instrumento de sopro?" +
                    "\n" +
                    "a) Violão\n" +
                    "b) Trombone\n" +
                    "c) Piano\n" +
                    "d) Bateria");
            char resposta5 = sc.next().toLowerCase().charAt(0);
            if (resposta5 == 'b'){
                pontuacao ++;
            }else {
                chances --;
                System.out.println("Respota errada, você tem apenas " + chances + " chances restantes");
            }
        }

        if (chances == 0){
            System.out.println("Você esgotou suas chances! Fim de jogo.");
        }else {
            System.out.println("Sua pontuação final: " + pontuacao + " de 5");
        }


        sc.close();
    }
}
