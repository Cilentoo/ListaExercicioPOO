package com.poo.lista4;

public class Exercicio2L4 {
    public static void resolucao5() {
        /*  */

        double array[] = {500.00, 600.00, 850.00, 1080.00};
        double sum = 0;
        double minValue = array[0];
        double maxValue = array[0];

        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if (array[i] < minValue){
                minValue = array[i];
            }
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("The total sales value is: " + sum);
        System.out.println("The min value is: " + minValue);
        System.out.println("The max value is: " + maxValue);
    }
}
