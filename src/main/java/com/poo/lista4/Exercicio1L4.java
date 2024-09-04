package com.poo.lista4;

public class Exercicio1L4 {
    public static void resolucao5() {
        /* 1) Voce é gerente de um supermercado e sabe que os valores das
        vendas do dia são gravados em um vetor. Digite um código que faça o
        fechamento (soma) de vendas do dia de maneira automatizada. */

        double array[] = new double[4];
        double soma;

        for (int i = 0; i < array.length; i++){
            array[0] = 500.00;
            array[1] = 600.00;
            array[2] = 850.00;
            array[3] = 1080.00;

            soma = array[0] + array[1] + array[2] + array[3];
            System.out.println("O total de vendas é: " + soma);
            break;
        }



    }
}
