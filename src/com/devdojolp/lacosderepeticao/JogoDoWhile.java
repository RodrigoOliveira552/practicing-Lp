package com.devdojolp.lacosderepeticao;

import java.util.Scanner;

public class JogoDoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: Digite um numero de 1 a 10");
            int p1 = teclado.nextInt();
            System.out.println("PLAYER 2: Digite um numero de 1 a 10");
            int p2 = teclado.nextInt();
            System.out.println("Acertou " + (p1 == p2));
            System.out.println("==============================");
            System.out.println("Desejam continuar jogando?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            desejaContinuar = teclado.nextInt();
        }while (desejaContinuar == 1);
    }
}
