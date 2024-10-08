package com.poo.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5L4 {
    public static void resolucao5() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> purchaseList = new ArrayList<>();

        while(true){
            System.out.println("\n--- Purchase List ---");
            System.out.println("1. Add Itens.");
            System.out.println("2. Check list.");
            System.out.println("3. Exit.");
            System.out.println("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Choose an item: ");
                    String item = sc.nextLine();
                    purchaseList.add(item);
                    System.out.println("Item added");
                    break;
                case 2:
                    if (purchaseList.isEmpty()){
                        System.out.println("Your list is empty!");
                    }else {
                        System.out.println("\n---- Your purchase list ----");
                        for (String i : purchaseList){
                            System.out.println("- " + i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
