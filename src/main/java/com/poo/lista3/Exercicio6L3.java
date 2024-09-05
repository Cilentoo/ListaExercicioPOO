package com.poo.lista3;


import java.util.Scanner;

public class Exercicio6L3 {
    public static void resolucao4() {
        /*
        6) Escreva um programa que seja capaz de desenhar uma pirâmide de
        asteriscos. O usuário deverá informar quantos andares ele deseja que a
        pirâmide tenha.
         */

        Scanner sc = new Scanner(System.in);
        int floors;

        System.out.println("Send the number of floors: ");
        floors = sc.nextInt();

        DrawPyramid(floors);
        sc.close();

    }

    public static void DrawPyramid(int n){
        for (int i = 1 ; i<= n ; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
