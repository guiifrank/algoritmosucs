package br.ucs.algoritmos.tdeAeroporto;

public class ListAeronaves {
    Aeronave head;

    ListAeronaves() {
        this.head = null;
    }

    void cadastraAeronave(Aeronave aviao) {
        if (head == null || head.id.compareTo(aviao.id) > 0) {
            aviao.next = head;
            head = aviao;
        } else {
            Aeronave current = head;
            while (current.next != null && current.next.id.compareTo(aviao.id) < 0) {
                current = current.next;
            }
            aviao.next = current.next;
            current.next = aviao;
        }
    }

    void imprimeAeronaves() {
        Aeronave current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + " Aterrissagens: " + current.aterrissagens + " Decolagens: " + current.decolagens);
            current = current.next;
        }
    }

    Aeronave buscaAviao(String id) {
        Aeronave current = head;
        while (current != null) {
            if (current.id.equals(id)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
