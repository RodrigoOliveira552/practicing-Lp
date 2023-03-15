package com.devdojolp.lacosderepeticao;

import java.util.Scanner;

public class MenuDeOpcoes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int menuOpcoes = 0;
        while (menuOpcoes != 3) {
            System.out.println("Olá! Por favor, digite a opção desejada: ");
            System.out.println("=== 1. Calcular Imposto ===");
            System.out.println("=== 2. Depositar Salário ===");
            System.out.println("=== 3. Sair ===");

            menuOpcoes = teclado.nextInt();

        }
    }
}