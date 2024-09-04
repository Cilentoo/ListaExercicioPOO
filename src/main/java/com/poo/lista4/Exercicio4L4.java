package com.poo.lista4;

public class Exercicio4L4 {
    public static void resolucao5() {
        /*4) Escreva um código que irá percorrer uma lista de números inteiros
        lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
        números pares presente*/

        int list [] = {3,5,6,7,8,10,22,55,110};

        for (int i = 0; i < list.length; i++){
            if (list[i] % 2 ==0){
                System.out.println(list[i] + " Even!");
            }
        }
    }
}
