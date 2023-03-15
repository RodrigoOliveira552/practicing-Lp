package com.devdojolp.lacosderepeticao;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado abaixo: ");
        int contador = teclado.nextInt();
        int i = 0;
        while (i <= contador) {
            if (i % 2 != 0) {
                System.out.println("Os números ímpares do valor digitado pelo usuário são: " + i);
            }
            i = i + 1;
        }
    }
}