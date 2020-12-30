package br.com.empenhados.praOndeVou.controllers;

import br.com.empenhados.praOndeVou.models.Ponto;
import br.com.empenhados.praOndeVou.repositories.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PontosController {
    @Autowired
    private PontoRepository pontoRepository;

    // Método responsavel para redirecionar
    // usuário para pagina de cadastrar um novo ponto.
    @GetMapping("/pontos/new")
    public String neww() {
        return "pontos/new";
    }

    // Método responsavel para criar um novo ponto
    @GetMapping("/pontos")
    public String create(Ponto ponto){

//        pontoRepository.save(ponto);

        return "redirect:/";
    }


}
