package br.gov.sp.fatec.Lab4semBDD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.Lab4semBDD.entity.Usuario;
import br.gov.sp.fatec.Lab4semBDD.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioController {

}
