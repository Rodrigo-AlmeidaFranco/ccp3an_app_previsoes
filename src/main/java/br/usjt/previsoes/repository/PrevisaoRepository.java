package br.usjt.previsoes.repository;

import br.usjt.previsoes.model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {
}
