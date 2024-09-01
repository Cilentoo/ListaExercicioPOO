package com.poo.listaroni;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
       Scanner sc = new Scanner(System.in);
       double largura;
       double comprimento;
       double area;
       double precoPorMetroQuadrado;

       System.out.println("Qual a largura do terreno: ");
       largura = sc.nextDouble();

       System.out.println("Qual o comprimento do terreno: ");
       comprimento = sc.nextDouble();

       System.out.println("Qual o preço por metro quadrado do terreno: ");
       precoPorMetroQuadrado = sc.nextDouble();

       area = largura * comprimento;
       System.out.println("A area é igual a: " + area);

       double preco = area * precoPorMetroQuadrado;
       System.out.println("O preco do terreno é: "+ preco);

       sc.close();
    }
}
