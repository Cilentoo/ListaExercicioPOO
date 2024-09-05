package com.poo.lista3;

import java.util.Scanner;

public class Exercicio7L3 {
    public static void resolucao4() {
        /*
        7) Aproveitando o exercício anterior, escreva um programa que consiga
        construir um retângulo. O usuário deve informar a largura e a altura em
        asteriscos
         */

        Scanner sc = new Scanner(System.in);
        int height;
        int width;

        System.out.println("Send the height: ");
        height = sc.nextInt();
        System.out.println("Send the width: ");
        width = sc.nextInt();

        DrawRectangle(height, width);
        sc.close();
    }

    public static void DrawRectangle(int height, int width ){
        for (int i = 1 ; i <= height; i++){
            for (int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
