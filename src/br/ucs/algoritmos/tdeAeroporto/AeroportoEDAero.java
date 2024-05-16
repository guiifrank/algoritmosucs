package br.ucs.algoritmos.tdeAeroporto;

public class AeroportoEDAero {
    ListAeronaves[] LDISP;
    Fila FDEC, FATE;
    RelatorioOperacoes relatorio;

    AeroportoEDAero() {
        LDISP = new ListAeronaves[26];
        for (int i = 0; i < 26; i++) {
            LDISP[i] = new ListAeronaves();
        }
        FDEC = new Fila();
        FATE = new Fila();
        relatorio = null;
    }

    void cadastraAviao(String id) {
        if (id.length() != 5 || !Character.isLetter(id.charAt(0)) || !Character.isLetter(id.charAt(1)) ||
                !Character.isDigit(id.charAt(2)) || !Character.isDigit(id.charAt(3)) || !Character.isDigit(id.charAt(4))) {
            System.out.println("ID inválido. Deve ser no formato XX123.");
            return;
        }

        int index = Character.toUpperCase(id.charAt(0)) - 'A';
        if (index < 0 || index >= 26) {
            System.out.println("ID inválido.");
            return;
        }

        Aeronave aviao = new Aeronave(id);
        LDISP[index].cadastraAeronave(aviao);
        System.out.println("Avião cadastrado com sucesso.");
    }

    void autorizaDecolar(String id) {
        Aeronave aviao = buscaAviao(id);
        if (aviao != null) {
            FDEC.enfileira(aviao);
            System.out.println("Decolagem autorizada.");
        } else {
            System.out.println("Avião não cadastrado.");
        }
    }

    void decolar() {
        Aeronave aviao = FDEC.desenfileira();
        if (aviao != null) {
            aviao.decolagens++;
            adicionaRelatorio(aviao.id, "Decolagem");
            System.out.println("Avião decolou: " + aviao.id);
        } else {
            System.out.println("Nenhum avião na fila de decolagem.");
        }
    }

    void autorizaAterrissar(String id) {
        Aeronave aviao = buscaAviao(id);
        if (aviao != null) {
            FATE.enfileira(aviao);
            System.out.println("Aterrissagem autorizada.");
        } else {
            System.out.println("Avião não cadastrado.");
        }
    }

    void aterrissar() {
        Aeronave aviao = FATE.desenfileira();
        if (aviao != null) {
            aviao.aterrissagens++;
            adicionaRelatorio(aviao.id, "Aterrissagem");
            System.out.println("Avião aterrissou: " + aviao.id);
        } else {
            System.out.println("Nenhum avião na fila de aterrissagem.");
        }
    }

    void adicionaRelatorio(String id, String operacao) {
        RelatorioOperacoes novoRelatorio = new RelatorioOperacoes(id, operacao);
        if (relatorio == null) {
            relatorio = novoRelatorio;
        } else {
            RelatorioOperacoes current = relatorio;
            while (current.next != null) {
                current = current.next;
            }
            current.next = novoRelatorio;
        }
    }

    Aeronave buscaAviao(String id) {
        int index = Character.toUpperCase(id.charAt(0)) - 'A';
        if (index < 0 || index >= 26) {
            return null;
        }
        return LDISP[index].buscaAviao(id);
    }

    void imprimeRelatorio() {
        RelatorioOperacoes current = relatorio;
        while (current != null) {
            System.out.println("ID: " + current.id + " Operação: " + current.operacao + " Data/Hora: " + current.dataHora);
            current = current.next;
        }
    }

    void imprimeAvioesCadastrados() {
        for (int i = 0; i < 26; i++) {
            LDISP[i].imprimeAeronaves();
        }
    }

    void imprimeProximasDecolagens() {
        FDEC.imprimeFila();
    }

    void imprimeProximasAterrissagens() {
        FATE.imprimeFila();
    }
}
