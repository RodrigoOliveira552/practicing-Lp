package com.devdojolp.condicionais;

import java.util.Scanner;

public class AlistamentoMilitar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu Sexo apenas com -M- ou -F-: ");
        String sexo = teclado.next();
        char sexoFeminino = 'F';
        char sexoMasculino = 'M';
        System.out.println("Digite sua idade abaixo: ");
        int idade = teclado.nextInt();
        if (sexo.equals("") || sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Feminino")) {
            System.out.println("Usuário inválido");
        }else if (sexoMasculino == 'M' || sexoFeminino == 'F' && idade >= 18) {
            System.out.println(" Alistamento Obrigatório");
        } else if (sexoMasculino == 'M' && idade < 18) {
            System.out.println(" Alistamento não permitido");
        } else if (sexoFeminino == 'F' && idade >= 18) {
            System.out.println(" Deseja se alistar?");
        } else {
            System.out.println(" Alistamento não permitido");
            }
        }
    }
