package br.ucs.algoritmos.aulaEad.tde;

public class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void add(int data) {
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

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void bubbleSort() {
        int n = 0;
        Node current = head;
        while (current != null) {
            n++;
            current = current.next;
        }
        for (int i = 0; i < n - 1; i++) {
            current = head;
            for (int j = 0; j < n - i - 1; j++) {
                if (current.data > current.next.data) {
                    // Troca os dados dos nós
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }
        }
    }
}
