package com.poo.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        // 5) Construa um algoritmo que calcule o valor de um terreno
        // baseado na sua área e valor por m2.

        //area = comprimento x largura
        // preco = precoMetroQuadrado * area

        Scanner sc = new Scanner(System.in);
        double comprimento;
        double largura;
        double area;
        double precoMetroQuadrado;
        double preco;

        System.out.println("Escreva o comprimento: ");
        comprimento = sc.nextDouble();

        System.out.println("Escreva a largura: ");
        largura = sc.nextDouble();

        area = largura * comprimento;

        System.out.println("Escreva o preço por metro quadrado: ");
        precoMetroQuadrado = sc.nextDouble();

        preco = precoMetroQuadrado * area;
        System.out.println("O valor do terreno é: R$ " + preco);



    }
}
