package br.gov.sp.fatec.Lab4semBDD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.Lab4semBDD.entity.Trabalho;

@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {

    public List<Trabalho> findByTituloAndUsuarioNomeContains(String titulo, String nomeUsuario);

    @Query("select t from Trabalho t join t.usuario u where t.titulo like %?1% and u.nome like %?2%")
    public List<Trabalho> buscarPorTituloENomeUsuario(String titulo, String nomeUsuario);

}
