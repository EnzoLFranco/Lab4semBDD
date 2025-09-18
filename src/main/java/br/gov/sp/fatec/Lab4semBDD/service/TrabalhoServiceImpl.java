package br.gov.sp.fatec.Lab4semBDD.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.Lab4semBDD.entity.Trabalho;
import br.gov.sp.fatec.Lab4semBDD.repository.TrabalhoRepository;
import br.gov.sp.fatec.Lab4semBDD.service.UsuarioService;
import br.gov.sp.fatec.Lab4semBDD.entity.Usuario;


@Service
public class TrabalhoServiceImpl implements TrabalhoService {

    private TrabalhoRepository trabalhoRepo;

    private UsuarioService usuarioService;

    public TrabalhoServiceImpl(TrabalhoRepository trabalhoRepo, UsuarioService usuarioService) {
        this.trabalhoRepo = trabalhoRepo;
        this.usuarioService = usuarioService;
    }

    @Override
    public Trabalho novoTrabalho(Trabalho trabalho) {
        if (trabalho == null || 
            trabalho.getTitulo() == null || 
            trabalho.getTitulo().isBlank() || 
            trabalho.getUsuario() == null || 
            trabalho.getUsuario().getId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Trabalho inválido");
        }
        if(trabalho.getDataHoraEntrega() == null) {
            trabalho.setDataHoraEntrega(java.time.LocalDateTime.now());
        }
        trabalho.setUsuario(usuarioService.buscarPorId(trabalho.getUsuario().getId()));
        return trabalhoRepo.save(trabalho);
    }

    @Override
    public List<Trabalho> buscarTodos() {
        return trabalhoRepo.findAll();
    }

    @Override
    public List<Trabalho> buscarPorTituloENomeUsuario(String titulo, String nomeUsuario) {
        return trabalhoRepo.buscarPorTituloENomeUsuario(titulo, nomeUsuario);
    }

}
