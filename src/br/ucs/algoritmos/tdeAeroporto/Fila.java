package br.ucs.algoritmos.tdeAeroporto;

public class Fila {
    Aeronave front;
    Aeronave rear;

    Fila() {
        this.front = this.rear = null;
    }

    void enfileira(Aeronave aviao) {
        if (rear == null) {
            front = rear = aviao;
        } else {
            rear.next = aviao;
            rear = aviao;
        }
    }

    Aeronave desenfileira() {
        if (front == null) {
            return null;
        }
        Aeronave temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    void imprimeFila() {
        Aeronave current = front;
        while (current != null) {
            System.out.println("ID: " + current.id);
            current = current.next;
        }
    }
}
