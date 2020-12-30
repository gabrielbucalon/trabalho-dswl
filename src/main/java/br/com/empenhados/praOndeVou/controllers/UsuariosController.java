package br.com.empenhados.praOndeVou.controllers;

import br.com.empenhados.praOndeVou.models.Ponto;
import br.com.empenhados.praOndeVou.models.Usuario;
import br.com.empenhados.praOndeVou.repositories.PontoRepository;
import br.com.empenhados.praOndeVou.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuariosController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Método responsavel para redirecionar
    // usuário para pagina de cadastrar um novo ponto.
    @GetMapping("/pontos/novo")
    public String neww() {
        return "pontos/novo";
    }

    // Método responsavel para criar um novo ponto
    @GetMapping("/novo")
    public String create(Usuario usuario){

//        pontoRepository.save(ponto);

        return "redirect:/";
    }


}
