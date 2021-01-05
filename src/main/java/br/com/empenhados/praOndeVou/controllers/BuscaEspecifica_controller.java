package br.com.empenhados.praOndeVou.controllers;

import br.com.empenhados.praOndeVou.models.Pontos;
import br.com.empenhados.praOndeVou.repositorio.BuscaEspecifica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class BuscaEspecifica_controller {
    @Autowired
    private BuscaEspecifica buscaEspecifica;

    @GetMapping("/busca")
    public ModelAndView index() {
        List<Pontos> listaPonto = this.buscaEspecifica.findAll();
        ModelAndView mv = new ModelAndView("registros/index");
        mv.addObject("listaPonto", listaPonto);

        return mv;
    }
}
