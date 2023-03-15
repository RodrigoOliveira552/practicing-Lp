package com.devdojolp.fors;

public class TabuadaZeroDezFor {
    public static void main(String[] args) {
        for (int i = 1; i <100; i++){
            System.out.println("FAZENDO TABUADA DO NÚMERO: " + i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "x" + j + "=" +(i*j));
            }
        }
    }

}
