package br.com.cesarMontaldi.codechella.application.evento;

import br.com.cesarMontaldi.codechella.domain.evento.Endereco;
import br.com.cesarMontaldi.codechella.domain.evento.Evento;

public interface RepositoryEvento {

    Evento buscarEnventoPorCidade(Endereco cep);
}
