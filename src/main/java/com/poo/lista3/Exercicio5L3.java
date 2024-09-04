package com.poo.lista3;

import java.util.Scanner;

public class Exercicio5L3 {
    public static void resolucao4() {
        /*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
        algum deles estiver errado o programa deve retornar ao usuário quais das
        opções está errada, se é o login ou a senha. O programa deve bloquear o
        acesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir
        um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!" */

        Scanner sc = new Scanner(System.in);
        String login = "Cilento12M3!";
        String password = "120621@1M";
        String userLogin;
        String userPassword;

        int acessAttempt = 3;

        do{
            System.out.println("Enter with your login: ");
            userLogin = sc.nextLine();
            System.out.println("Enter with your password: ");
            userPassword = sc.nextLine();

            if (!userLogin.equals(login) && acessAttempt >1){
                System.out.println("Your login is incorrect please try again: ");
                acessAttempt-- ;
            }else if (!userPassword.equals(password) && acessAttempt >1){
                System.out.println("Your password is incorrect please try again: ");
                acessAttempt-- ;
            }else if (!userLogin.equals(login) && acessAttempt == 1) {
                System.out.println("Thats your last chance: ");
            } else if (!userPassword.equals(password) && acessAttempt == 1) {
                System.out.println("Thats your last chance: ");
            }else {
                System.out.println("Welcome to system bank: " + login);
                break;
            }
        }while(acessAttempt > 0);

        sc.close();
    }
}
