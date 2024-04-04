package br.ucs.algoritmos.aula4;

import java.util.HashSet;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Método para inserir um novo número inteiro no final da lista
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Método para escrever a lista
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Método para contar quantas vezes um número específico aparece na lista
    public int countOccurrences(int target) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Método para remover a primeira ocorrência de um número específico na lista
    public void removeFirstOccurrence(int target) {
        if (head == null) {
            return;
        }
        if (head.data == target) {
            head = head.next;
            return;
        }
        Node prev = head;
        Node current = head.next;
        while (current != null) {
            if (current.data == target) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // Método para escrever os elementos repetidos (aparece uma vez cada valor repetido)
    public void displayDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        System.out.println("Elementos repetidos:");
        while (current != null) {
            if (!set.add(current.data)) {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Método para apresentar a soma dos valores armazenados nas posições ímpares da lista
    public int sumOddPositions() {
        int sum = 0;
        Node current = head;
        int position = 1;
        while (current != null) {
            if (position % 2 != 0) {
                sum += current.data;
            }
            current = current.next;
            position++;
        }
        return sum;
    }

    // Método para ler um valor e colocá-lo no início da lista se existir, ou inseri-lo no final da lista caso contrário
    public void moveToFrontOrInsert(int value) {
        if (head == null) {
            insert(value);
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data == value) {
                if (prev != null) {
                    prev.next = current.next;
                    current.next = head;
                    head = current;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
        insert(value); // Se o valor não estiver na lista, insere no final
    }

    // Método para remover da lista os nodos cujos valores armazenados são pares
    public void removeEvenValues() {
        while (head != null && head.data % 2 == 0) {
            head = head.next;
        }
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data % 2 == 0) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
    }
}
