package com.devdojolp.variaveis;

import java.util.Scanner;

public class ScannerDadosDoTeclado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome abaixo: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade abaixo: ");
        int idade = teclado.nextInt();
    }
}
