package com.devdojolp.variaveis;

public class CalcularImposto {
    public static void main(String[] args) {
        double salario = 2500.00;
        double percentual = 30;
        double valorFinal = salario * (percentual / 100);
        System.out.print("O valor da porcentagem é: " +
                valorFinal);
    }
}
