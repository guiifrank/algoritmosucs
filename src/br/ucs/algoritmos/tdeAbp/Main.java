package br.ucs.algoritmos.tdeAbp;

public class Main {
    public static void main(String[] args) {
    ArvoreBinariaPesquisa arvore = new ArvoreBinariaPesquisa();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Percurso em pré-ordem:");
        arvore.percursoPreOrdem(arvore.raiz);

        System.out.println("\nPercurso em ordem:");
        arvore.percursoEmOrdem(arvore.raiz);

        System.out.println("\nPercurso em pós-ordem:");
        arvore.percursoPosOrdem(arvore.raiz);

        System.out.println("\nSoma dos nodos-folha:");
        System.out.println(arvore.somaNodosFolha(arvore.raiz));

        System.out.println("Nodos-folha em ordem decrescente:");
        arvore.imprimirNodosFolhaDecrescente(arvore.raiz);

        System.out.println("\nAltura da árvore:");
        System.out.println(arvore.altura(arvore.raiz));

        System.out.println("Removendo nodo 20:");
        arvore.remover(20);
        arvore.percursoEmOrdem(arvore.raiz);

        System.out.println("\nRemovendo nodo 30:");
        arvore.remover(30);
        arvore.percursoEmOrdem(arvore.raiz);

        System.out.println("\nRemovendo nodo 50:");
        arvore.remover(50);
        arvore.percursoEmOrdem(arvore.raiz);
    }
}
