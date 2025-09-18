package br.gov.sp.fatec.Lab4semBDD.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.sp.fatec.Lab4semBDD.entity.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {
    Optional<Autorizacao> findByNome(String nome);
}
