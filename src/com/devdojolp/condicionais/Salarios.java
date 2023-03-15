package com.devdojolp.condicionais;

public class Salarios {
    public static void main(String[] args) {

        double salario = 3500.00;

        if (salario > 4500.00) {
            double resultado = salario * 0.3;
            System.out.println("30% é igual a: " + resultado);
        } else {
            double resultado = salario * 0.1;
            System.out.println("10% é igual a: " + resultado);

        }
    }
}
