package com.poo.lista4;

import java.sql.SQLOutput;
import java.util.*;

public class Exercicio6L4 {
    public static void resolucao5() {
        /* 6) Aproveite a questão anterior e adiciona a opção do usuário remover
        um item.

        7) Aproveite o código que estamos utilizando e implemente um preço
        para cada item (Dica. Utilizem outra lista e use os mesmos índices para
        o item e para o preço).

        8) Aproveite os códigos anteriores e implemente a função de impressão
        por ordem de preço (crescente)*/


        //Adicionar o preço com virgula para nao quebrar o programa

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<String> purchaseList = new ArrayList<>();
        Map<String, Double> buy = new HashMap<>();

        while(true){
            System.out.println("\n--- Purchase List ---");
            System.out.println("1. Add Item.");
            System.out.println("2. Check list.");
            System.out.println("3. Remove item.");
            System.out.println("4. Exit.");
            System.out.println("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Choose an item: ");
                    String item = sc.nextLine();

                    System.out.println("What is the price: ");
                    Double price = sc.nextDouble();

                    buy.put(item,price);

                    purchaseList.add(item);
                    System.out.println("Item added");
                    break;
                case 2:
                    if (purchaseList.isEmpty()){
                        System.out.println("Your list is empty!");
                    }else {
                        System.out.println("\n---- Your purchase list ----");
                        List<Map.Entry<String, Double>> list = new ArrayList<>((buy.entrySet()));
                        list.sort(Map.Entry.comparingByValue());
                        for (String i : purchaseList){
                            System.out.println("- " + i);
                        }
                    }
                    break;
                case 3:
                    if (purchaseList.isEmpty()){
                        System.out.println("There´s no itens to remove! ");
                    }else {
                        System.out.println("\n--- Your purchase list ---");
                        for (int i = 0; i < purchaseList.size(); i++){
                            System.out.println((i+1)+ ". " + purchaseList.get(i));
                        }
                        System.out.println("Choose the number of item you want to remove");
                        int removeItem = sc.nextInt();

                        if (removeItem > 0 && removeItem <= purchaseList.size()){
                            purchaseList.remove(removeItem - 1);
                            System.out.println("Item removed successfully! ");
                        }else {
                            System.out.println("Invalid number, please try again!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
