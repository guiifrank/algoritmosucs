package br.ucs.algoritmos.aula2.tde;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private int option;
    public void menu() {
        System.out.println("1. Insere carta");
        System.out.println("2. Ver lista de cartas");
        System.out.println("3. Ver lista de cartas invertidas");
        System.out.println("4. Sair");
        option = sc.nextInt();
        sc.close();

        switch (option) {
            case 1:
                option = 1;
                break;
            case 2:
                option = 2;
                break;
            case 3:
                option = 3;
                break;
            case 4:
                option = 4;
                break;
        }
    }

}
