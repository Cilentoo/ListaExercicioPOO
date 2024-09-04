package com.poo.lista3;

import java.util.Scanner;

public class Exercicio4L3 {
    public static void resolucao4() {
        /* 4) Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
        para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
        "Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio". */

        Scanner sc = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100 + 1);
        int attempts = 0;
        int maxAttempts = 15;

        for(int i = 0; i < maxAttempts; i++){
            System.out.println("Send same number : ");
            int guess = sc.nextInt();
            attempts++;
            if (guess < secretNumber){
                System.out.println("Higher! ");
            }else if(guess > secretNumber){
                System.out.println("Smaller! ");
            }else {
                System.out.println("Congratulations!");
                break;
            }
        }

        if (attempts == maxAttempts){
            System.out.printf("Your attempts are over! The secret number was %d. \n"
                    , secretNumber);
        }

        sc.close();
    }
}
