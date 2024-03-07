package br.ucs.algoritmos.aula1;

public class SequentialSearchExample {
    // Função para pesquisa sequencial
    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Se o elemento for encontrado, retorna o índice
            }
        }
        return -1; // Se o elemento não for encontrado, retorna -1
    }
}