package br.com.cesarMontaldi.codechella.application.evento;

import br.com.cesarMontaldi.codechella.domain.evento.Categoria;
import br.com.cesarMontaldi.codechella.application.ingresso.DadosCadastroTipoIngresso;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}
