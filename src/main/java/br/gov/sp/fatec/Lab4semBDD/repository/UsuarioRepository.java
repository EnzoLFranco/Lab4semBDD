package br.gov.sp.fatec.Lab4semBDD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.Lab4semBDD.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
