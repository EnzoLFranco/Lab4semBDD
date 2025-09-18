package br.gov.sp.fatec.Lab4semBDD.service;

import br.gov.sp.fatec.Lab4semBDD.entity.Trabalho;
import java.util.List;

import br.gov.sp.fatec.Lab4semBDD.repository.TrabalhoRepository;

public interface TrabalhoService {

    public List<Trabalho> buscarTodos();

    public Trabalho novoTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarPorTituloENomeUsuario(String titulo, String nomeUsuario);

}
