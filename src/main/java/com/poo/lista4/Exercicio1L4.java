package com.poo.lista4;

public class Exercicio1L4 {
    public static void resolucao5() {
        /* 1) Voce é gerente de um supermercado e sabe que os valores das
        vendas do dia são gravados em um vetor. Digite um código que faça o
        fechamento (soma) de vendas do dia de maneira automatizada. */

        double array[] = {500.00, 600.00, 850.00, 1080.00};
        double sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("The total sales value is: " + sum);
    }
}
