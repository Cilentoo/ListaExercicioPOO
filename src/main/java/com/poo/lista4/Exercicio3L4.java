package com.poo.lista4;

public class Exercicio3L4 {
    public static void resolucao5() {
        /* 3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
        vendas do dia */

        double array[] = {500.00, 600.00, 850.00, 1080.00};
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("The total sales value is: $ " + sum);

        System.out.println("Ticket: " + sum/ array.length);

    }
}
