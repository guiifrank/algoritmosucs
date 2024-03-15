package br.ucs.algoritmos.aula2.tde;

public class JogoCartas {
    private static final int MAX_CARTAS = 9;
    private int[] cartas;
    private int numCartas;

    public JogoCartas() {
        cartas = new int[MAX_CARTAS];
        numCartas = 0;
    }
    public void recebeCartas(int carta) {
        if (numCartas >= MAX_CARTAS) {
            System.out.println("Erro: Limite maximo de cartas atingido");
            return;
        }
        int i = numCartas - 1;
        while (i >= 0 && cartas[i] > carta) {
            cartas[i + 1] = cartas[i];
            i--;
        }
        cartas[i + 1] = carta;
        numCartas++;
    }
    public void verListaCartas() {
        System.out.print("Cartas em ordem crescente: ");
        for (int i = 0; i < numCartas; i++) {
            System.out.print(cartas[i] + " ");
        }
        System.out.println();
    }
    public void verListaCartasInvertida() {
        System.out.print("Cartas em ordem decrescente: ");
        for (int i = numCartas - 1; i >= 0; i--) {
            System.out.print(cartas[i] + " ");
        }
        System.out.println();
    }
}
