package com.devdojolp.condicionais;

import java.util.Scanner;

public class CadastroDeLogin {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = teclado.next();
        if (nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido");
        }else {
            System.out.println( nome + " cadastrado com sucesso");
        }
    }
}
