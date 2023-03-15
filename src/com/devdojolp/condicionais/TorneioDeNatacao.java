package com.devdojolp.condicionais;

import java.util.Scanner;

public class TorneioDeNatacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu  nome abaixo: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade abaixo: ");
        int idade = teclado.nextInt();
        if (idade < 10) {
            System.out.println(nome + " participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + "participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + "participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + "ADULTO");
        }
    }
}
