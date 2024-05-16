package br.ucs.algoritmos.tdeAeroporto;

import java.time.LocalDateTime;

public class RelatorioOperacoes {
    String id;
    String operacao;
    LocalDateTime dataHora;
    RelatorioOperacoes next;

    RelatorioOperacoes(String id, String operacao) {
        this.id = id;
        this.operacao = operacao;
        this.dataHora = LocalDateTime.now();
        this.next = null;
    }
}
