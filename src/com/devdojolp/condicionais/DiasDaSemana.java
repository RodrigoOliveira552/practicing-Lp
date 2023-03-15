package com.devdojolp.condicionais;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        int dia = teclado.nextInt();
        if (dia == 1) {
            System.out.println(" Segunda-Feira");
        } else if (dia == 2) {
            System.out.println(" Terça-Feira");
        } else if (dia == 3) {
            System.out.println(" Quata-Feira");
        } else if (dia == 4) {
            System.out.println(" Quinta-Feira");
        } else if (dia == 5) {
            System.out.println(" Sexta-Feira");
        } else if (dia == 6) {
            System.out.println(" Sábado");
        } else if (dia == 7) {
            System.out.println(" Domingo");
        } else{
            System.out.println(" Dia Inválido");
        }
    }
}
