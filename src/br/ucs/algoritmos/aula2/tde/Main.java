package br.ucs.algoritmos.aula2.tde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JogoCartas jogo = new JogoCartas();

        int option;
        int carta;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Receber carta");
            System.out.println("2. Ver lista de cartas em ordem crescente");
            System.out.println("3. Ver lista de cartas em ordem decrescente");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Digite o valor da carta (entre 1 e 13): ");
                    carta = sc.nextInt();
                    if (carta < 1 || carta > 13) {
                        System.out.println("Valor inválido. Digite um valor entre 1 e 13.");
                    } else {
                        jogo.recebeCartas(carta);
                    }
                    break;
                case 2:
                    jogo.verListaCartas();
                    break;
                case 3:
                    jogo.verListaCartasInvertida();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        } while (option != 4);

        sc.close();
    }
}
