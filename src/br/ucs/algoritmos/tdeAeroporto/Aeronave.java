package br.ucs.algoritmos.tdeAeroporto;

public class Aeronave {
    String id;
    int aterrissagens;
    int decolagens;
    Aeronave next;

    Aeronave(String id) {
        this.id = id;
        this.aterrissagens = 0;
        this.decolagens = 0;
        this.next = null;
    }
}
