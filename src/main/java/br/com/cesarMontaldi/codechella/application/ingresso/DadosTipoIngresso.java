package br.com.cesarMontaldi.codechella.application.ingresso;

import br.com.cesarMontaldi.codechella.domain.ingresso.Definicao;
import br.com.cesarMontaldi.codechella.domain.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
