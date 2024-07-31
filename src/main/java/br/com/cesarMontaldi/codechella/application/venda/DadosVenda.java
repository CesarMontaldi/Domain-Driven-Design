package br.com.cesarMontaldi.codechella.application.venda;

import br.com.cesarMontaldi.codechella.application.ingresso.DadosTipoIngresso;
import br.com.cesarMontaldi.codechella.application.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
