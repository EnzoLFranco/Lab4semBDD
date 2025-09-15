package br.gov.sp.fatec.Lab4semBDD.service;

import java.util.List;
import br.gov.sp.fatec.Lab4semBDD.entity.Usuario;

public interface IUsuarioService {

    Usuario buscarPorId(Long id);

    Usuario novoUsuario(Usuario usuario);

    List<Usuario> buscarTodos();

}
