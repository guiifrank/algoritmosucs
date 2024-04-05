package br.ucs.algoritmos.aula5.tde;

public class Main {
    public static void main(String[] args) {
        PalindromeChecker.DoublyLinkedList list = new PalindromeChecker.DoublyLinkedList();
        String text = "arara";
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
