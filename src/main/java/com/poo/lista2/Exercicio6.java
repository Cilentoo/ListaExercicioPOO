package com.poo.lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao2() {
        /* 6) Crie um programa que receba as notas de um aluno e informe se ele foi
        aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
        provas ele passou. Senão o programa deverá perguntar a nota de recuperação
        que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
        somente para os alunos que precisarem.*/

        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2)/2;

        if (media >=6){
            System.out.println("Parabéns você foi aprovado!");
        }else {
            System.out.println("Você esta na recuperação!");
            double menorNota = (nota1 < nota2) ? nota1 : nota2;

            System.out.println("Digite a nota da recuperação");
            double notaRec = sc.nextDouble();

            double novaMedia = (notaRec + Math.max(nota1, nota2)/2);
            if (novaMedia >= 6){
                System.out.println("Aprovado na recuperação!");
            }else {
                System.out.println("Reprovado!");
            }
        }

        sc.close();
    }
}
