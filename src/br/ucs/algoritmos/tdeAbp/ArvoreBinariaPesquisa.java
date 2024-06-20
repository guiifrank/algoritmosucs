package br.ucs.algoritmos.tdeAbp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArvoreBinariaPesquisa {
    Nodo raiz;

    ArvoreBinariaPesquisa() {
        raiz = null;
    }

    void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    Nodo inserirRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        else if (valor > raiz.valor)
            raiz.direita = inserirRec(raiz.direita, valor);

        return raiz;
    }

    void percursoPreOrdem(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            percursoPreOrdem(nodo.esquerda);
            percursoPreOrdem(nodo.direita);
        }
    }

    void percursoEmOrdem(Nodo nodo) {
        if (nodo != null) {
            percursoEmOrdem(nodo.esquerda);
            System.out.print(nodo.valor + " ");
            percursoEmOrdem(nodo.direita);
        }
    }

    void percursoPosOrdem(Nodo nodo) {
        if (nodo != null) {
            percursoPosOrdem(nodo.esquerda);
            percursoPosOrdem(nodo.direita);
            System.out.print(nodo.valor + " ");
        }
    }

    int somaNodosFolha(Nodo nodo) {
        if (nodo == null)
            return 0;
        if (nodo.esquerda == null && nodo.direita == null)
            return nodo.valor;
        return somaNodosFolha(nodo.esquerda) + somaNodosFolha(nodo.direita);
    }

    void imprimirNodosFolhaDecrescente(Nodo nodo) {
        List<Integer> nodosFolha = new ArrayList<>();
        coletarNodosFolha(nodo, nodosFolha);
        Collections.sort(nodosFolha, Collections.reverseOrder());
        for (int valor : nodosFolha) {
            System.out.print(valor + " ");
        }
    }

    void coletarNodosFolha(Nodo nodo, List<Integer> nodosFolha) {
        if (nodo != null) {
            if (nodo.esquerda == null && nodo.direita == null) {
                nodosFolha.add(nodo.valor);
            }
            coletarNodosFolha(nodo.esquerda, nodosFolha);
            coletarNodosFolha(nodo.direita, nodosFolha);
        }
    }

    int altura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        int alturaEsquerda = altura(nodo.esquerda);
        int alturaDireita = altura(nodo.direita);
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    Nodo removerRec(Nodo raiz, int valor) {
        if (raiz == null) return raiz;

        if (valor < raiz.valor)
            raiz.esquerda = removerRec(raiz.esquerda, valor);
        else if (valor > raiz.valor)
            raiz.direita = removerRec(raiz.direita, valor);
        else {
            if (raiz.esquerda == null)
                return raiz.direita;
            else if (raiz.direita == null)
                return raiz.esquerda;

            raiz.valor = valorMinimo(raiz.direita);
            raiz.direita = removerRec(raiz.direita, raiz.valor);
        }
        return raiz;
    }

    int valorMinimo(Nodo raiz) {
        int valorMin = raiz.valor;
        while (raiz.esquerda != null) {
            valorMin = raiz.esquerda.valor;
            raiz = raiz.esquerda;
        }
        return valorMin;
    }

}
