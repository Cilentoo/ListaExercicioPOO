package com.poo.listaroni;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double valorHorasTrabalhadas = 10.00;
        double valorHorasExtras = 15.00;
        int horasTrabalhadas;
        int horasExtrasTrabalhadas;
        double salarioAnual;
        

        System.out.println("Escreva o número de horas tralhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Escreva o número de horas extras tralhadas: ");
        horasExtrasTrabalhadas = sc.nextInt();

        salarioAnual = (valorHorasTrabalhadas * horasTrabalhadas) + (valorHorasExtras * horasExtrasTrabalhadas);
        System.out.println("Seu salário anual é: " + salarioAnual);

        sc.close();
    }
}
