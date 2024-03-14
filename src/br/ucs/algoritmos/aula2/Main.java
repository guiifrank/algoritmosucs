package br.ucs.algoritmos.aula2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Animal[] vetor = new Animal[10];
        vetor[0] = new Animal("dog", 1);
        vetor[1] = new Animal("cat", 2);
        vetor[2] = new Animal("bird", 3);
        vetor[3] = new Animal("pig", 4);
        vetor[4] = new Animal("turtle", 5);
        vetor[5] = new Animal("shark", 6);
        vetor[6] = new Animal("wolf", 7);
        vetor[7] = new Animal("eagle", 8);
        vetor[8] = new Animal("fish", 9);
        vetor[9] = new Animal("lion", 10);

        inverterLista(vetor);

        for (Animal animal : vetor) {
            System.out.println(animal);
        }
    }
        public static void inverterLista(Animal[] vetor) {
            int tamanho = vetor.length;
            for (int i = 0; i < tamanho / 2; i++) {
                Animal temp = vetor[i];
                vetor[i] = vetor[tamanho - 1 - i];
                vetor[tamanho - 1 - i] = temp;
            }
        }

    }

