package com.poo.listaroni;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);

		int n1;
		int n2; 

		System.out.println("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		n2 = sc.nextInt();

		System.out.println("O resultado final é: "+  (n1 + n2));

		sc.close(); 
    }
}
