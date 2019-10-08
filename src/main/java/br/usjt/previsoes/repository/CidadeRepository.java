package br.usjt.previsoes.repository;

import br.usjt.previsoes.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> findByLatitudeAndLongitude(double latitude, double longitude);

    List<Cidade> findByNome(String nome);

    List<Cidade> findByNomeIgnoreCase(String nome);
}
