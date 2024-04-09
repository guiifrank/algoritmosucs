package br.ucs.algoritmos.aula5.tde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker.DoublyLinkedList list = new PalindromeChecker.DoublyLinkedList();
        System.out.println("Digite a palavra que deseja verificar: ");
        String text = sc.next();
        for (int i = 0; i < text.length(); i++) {
            list.append(text.charAt(i));
        }
        int result = list.isPalindrome();
        if (result == 1)
            System.out.println("O texto é uma palíndrome.");
        else
            System.out.println("O texto não é uma palíndrome.");
    }
}
