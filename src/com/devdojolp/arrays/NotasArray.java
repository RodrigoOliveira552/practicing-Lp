package com.devdojolp.arrays;

import java.util.Scanner;

public class NotasArray {
    public static void main(String[] args) {
       /* double nota1 = 7.5;
        double nota2 = 8;
        double nota3 = 3;
        double media = (nota1 + nota2 + nota3) /3;
        System.out.println("Média final é: " + media);*/

        double[] notas = new double[4];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i+1));
            notas[i] = teclado.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length ; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i+1) + ": " + notas[i]);

        }
        media = media / notas.length;
        System.out.println("Media das notas: " + media);

    }

}
