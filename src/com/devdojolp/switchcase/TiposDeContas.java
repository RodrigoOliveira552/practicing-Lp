package com.devdojolp.switchcase;

import java.util.Scanner;

public class TiposDeContas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a opção referente a conta desejada: ");
        System.out.println("=== 1 - CONTA_POUPANÇA ===");
        System.out.println("=== 2 - CONTA_CORRENTE ===");
        System.out.println("=== 3 - CONTA_INVESTIMENTO ===");
        int tipoDeConta = teclado.nextInt();
        switch (tipoDeConta) {
            case 1:
                System.out.println("CONTA POUPANÇA POSSUÍ 0,05% DE JUROS");
                break;

            case 2:
                System.out.println("CONTA CORRENTE POSSUÍ 0,02% DE JUROS");
                break;

            case 3:
                System.out.println("CONTA INVESTIMENTO POSSUÍ 0,01% DE JUROS");
                break;
            default:
                System.out.println("TIPO DE CONTA NÃO EXISTE");

        }
    }
}

