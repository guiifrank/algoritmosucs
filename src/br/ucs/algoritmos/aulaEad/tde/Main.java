package br.ucs.algoritmos.aulaEad.tde;

import java.util.Random;

public class Main {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] randomNumbers = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            randomNumbers[i] = rand.nextInt(1000); // Números entre 0 e 999
        }

        int[] randomNumbersLinkedList = randomNumbers.clone();

        long startTime = System.nanoTime();
        bubbleSort(randomNumbers);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Tempo de ordenação com vetor: " + elapsedTime + " nanossegundos");

        LinkedList list = new LinkedList();
        for (int num : randomNumbersLinkedList) {
            list.add(num);
        }
        startTime = System.nanoTime();
        list.bubbleSort();
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Tempo de ordenação com lista encadeada: " + elapsedTime + " nanossegundos");

        int[] decreasingNumbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            decreasingNumbers[i] = 999 - i;
        }

        int[] decreasingNumbersLinkedList = decreasingNumbers.clone();

        startTime = System.nanoTime();
        bubbleSort(decreasingNumbers);
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("\nTempo de ordenação decrescente com vetor: " + elapsedTime + " nanossegundos");

        list = new LinkedList();
        for (int num : decreasingNumbersLinkedList) {
            list.add(num);
        }
        startTime = System.nanoTime();
        list.bubbleSort();
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Tempo de ordenação decrescente com lista encadeada: " + elapsedTime + " nanossegundos");
    }
}
