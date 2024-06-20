package br.ucs.algoritmos.tdeAbp;

public class Nodo {
    int valor;
    Nodo esquerda, direita;

    public Nodo(int item) {
        valor = item;
        esquerda = direita = null;
    }
}
