package br.ucs.algoritmos.aula1;

import static br.ucs.algoritmos.aula1.SequentialSearchExample.sequentialSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 10, 15, 20};
        int key = 5;
        int result = sequentialSearch(arr, key);
        if (result == -1)
            System.out.println("Elemento não encontrado.");
        else
            System.out.println("Elemento encontrado no índice: " + result);
    }
}
