package br.com.empenhados.praOndeVou.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PontosController {

    @GetMapping("/pontos/new")
    public String neww() {
        return "pontos/new";
    }
}
