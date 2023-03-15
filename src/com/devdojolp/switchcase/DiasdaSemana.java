package com.devdojolp.switchcase;

public class DiasdaSemana {
    public static void main(String[] args) {
        int dia = 16;
        switch (dia){
            case 1:
                System.out.println("SEGUNDA");
                break;

            case 2:
                System.out.println("TERÇA");
                break;
            case 3:
                System.out.println("QUARTA");
                break;

            case 4:
                System.out.println("QUINTA");
                break;

            case 5:
                System.out.println("SEXTA");
                break;

            case 6:
                System.out.println("SÁBADO");
                break;

            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("DIA INVÁLIDO");
        }

    }
}
