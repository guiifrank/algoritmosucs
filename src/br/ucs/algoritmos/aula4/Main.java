package br.ucs.algoritmos.aula4;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserção de elementos
        list.insert(5);
        list.insert(3);
        list.insert(7);
        list.insert(5);
        list.insert(8);
        list.insert(5);

        // Exibição da lista
        System.out.println("Lista:");
        list.display();

        // a) Escrever os elementos repetidos
        list.displayDuplicates();

        // b) Apresentar a soma dos valores armazenados nas posições ímpares da lista
        int sumOdd = list.sumOddPositions();
        System.out.println("Soma dos valores armazenados nas posições ímpares: " + sumOdd);

        // c) Ler um valor e colocá-lo no início da lista se existir, ou inseri-lo no final da lista caso contrário
        int valueToMoveToFrontOrInsert = 7;
        list.moveToFrontOrInsert(valueToMoveToFrontOrInsert);

        // Exibição da lista após a operação c)
        System.out.println("Lista após mover para frente ou inserir o valor " + valueToMoveToFrontOrInsert + ":");
        list.display();

        // d) Remover da lista os nodos cujos valores armazenados são pares
        list.removeEvenValues();

        // Exibição da lista após a operação d)
        System.out.println("Lista após remover os valores pares:");
        list.display();
    }
}
