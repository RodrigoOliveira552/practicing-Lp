package com.devdojolp.lacosderepeticao;

import java.util.Random;
import java.util.Scanner;

public class BlackjackDoGusta {
    public static void main(String[] args) {

        try {
            System.out.println("Bem vindo ao jogo teste do BlackJack em Java");
            Scanner teclado = new Scanner(System.in);
            Random rand = new Random();
            int limite = 11;
            int num = 21;
            int player1 = 0;
            int player2 = 0;
            boolean verificacao = true;
            boolean verificacao2 = false;
            boolean decisaoFinal = false;

            while (verificacao) {
                System.out.println("Jogador 1 deseja adicionar um número? ");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                byte decisao = teclado.nextByte();
                if (decisao == 1) {
                    int numRand = rand.nextInt(limite);
                    player1 = player1 + numRand;
                    System.out.println("-------------------------");
                    System.out.println("Seu número atual é: " + player1);
                    System.out.println("-------------------------");
                } else if (decisao == 2) {
                    System.out.println("Você terminou por aqui.");
                    System.out.println("-------------------------");
                    System.out.println("Seu número é: " + player1);
                    System.out.println("-------------------------");
                    verificacao = false;
                    verificacao2 = true;
                } else {
                    System.out.println("Número Inválido. Digite novamente um número válido");
                    System.out.println("---------------------------\n");
                }
                if (player1 > num) {
                    System.out.println("BlackJack");
                    System.out.println("O player 1 perdeu :( ");
                    break;

                }
            }

            System.out.println("\n");

            while (verificacao2) {
                System.out.println("Jogador 2 deseja adicionar um número? ");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                byte decisao = teclado.nextByte();
                if (decisao == 1) {
                    int numRand = rand.nextInt(limite);
                    player2 = player2 + numRand;
                    System.out.println("-------------------------");
                    System.out.println("Seu número atual é: " + player2);
                    System.out.println("-------------------------");

                } else if (decisao == 2) {
                    System.out.println("Você terminou por aqui.");
                    System.out.println("-------------------------");
                    System.out.println("Seu número é: " + player2);
                    System.out.println("-------------------------");
                    verificacao2 = false;
                    decisaoFinal = true;
                } else {
                    System.out.println("Número Inválido. Digite novamente um número válido");
                    System.out.println("---------------------------\n");
                }
                if (player2 > num) {
                    System.out.println("BlackJack");
                    System.out.println("O player 2 perdeu :( ");
                    break;
                }
            }
            while (decisaoFinal) {
                System.out.println("Decisões finais consideradas: \n");
                if (player1 > player2) {
                    System.out.println("O jogador 1 ganhou o jogo por " + player1 + " à " + player2);
                } else if (player1 == player2) {
                    System.out.println("O jogo empatou");
                } else if (player1 < player2) {
                    System.out.println("O jogador 2 ganhou o jogo por " + player2 + " à " + player1);
                }
                break;
            }


        } catch (Exception ex) {
            System.out.println("O erro seguinte: " + ex);
        }
    }
}
