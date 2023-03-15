package com.devdojolp.lacosderepeticao;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String login = "Miguel";
        final String password = "to chegando";
        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.println("Digite seu login");
            String loginDigitado = teclado.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = teclado.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)){
                System.out.println("ACESSO CONSEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");

        }
        System.out.println("TERMINADO");
    }
}
