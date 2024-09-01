package com.poo.listaroni;

import java.util.Scanner;

public class Exercicio9 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);

        int distanciaKm;
        int combustivelGasto;

        System.out.println("Leia a distancia percorrida em km: ");
        distanciaKm = sc.nextInt();

        System.out.println("Leia o total de combustivel gasto em litros: ");
        combustivelGasto = sc.nextInt();

        int gastoMedio = distanciaKm/combustivelGasto;

        System.out.println("O gasto medio do carro é: " + gastoMedio);
        
        sc.close();
    }
}
