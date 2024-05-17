package br.ucs.algoritmos.tdeAeroporto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Cadastrar avião");
            System.out.println("2. Autorizar decolagem");
            System.out.println("3. Decolar avião");
            System.out.println("4. Autorizar aterrissagem");
            System.out.println("5. Aterrissar avião");
            System.out.println("6. Imprimir aviões cadastrados");
            System.out.println("7. Imprimir próximas decolagens");
            System.out.println("8. Imprimir próximas aterrissagens");
            System.out.println("9. Imprimir relatório do aeroporto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do avião: ");
                    String id = scanner.next();
                    aeroporto.cadastraAviao(id);
                    break;
                case 2:
                    System.out.print("Digite o ID do avião: ");
                    id = scanner.next();
                    aeroporto.autorizaDecolar(id);
                    break;
                case 3:
                    aeroporto.decolar();
                    break;
                case 4:
                    System.out.print("Digite o ID do avião: ");
                    id = scanner.next();
                    aeroporto.autorizaAterrissar(id);
                    break;
                case 5:
                    aeroporto.aterrissar();
                    break;
                case 6:
                    aeroporto.imprimeAvioesCadastrados();
                    break;
                case 7:
                    aeroporto.imprimeProximasDecolagens();
                    break;
                case 8:
                    aeroporto.imprimeProximasAterrissagens();
                    break;
                case 9:
                    aeroporto.imprimeRelatorio();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
