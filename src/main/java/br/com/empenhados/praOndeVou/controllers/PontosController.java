package br.com.empenhados.praOndeVou.controllers;

import br.com.empenhados.praOndeVou.dto.RequisicaoPonto;
import br.com.empenhados.praOndeVou.dto.RequisicaoUsuario;
import br.com.empenhados.praOndeVou.models.Ponto;
import br.com.empenhados.praOndeVou.models.Usuario;
import br.com.empenhados.praOndeVou.repositories.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

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
        ponto.setLatitude(-22.883141);
        ponto.setLongitude(-47.210918);
        ponto.setUsuario_id(2);
//        ponto.set("teste");
        System.out.println(">>>>" + ponto);

        pontoRepository.save(ponto);

        return "redirect:/pontos/new";
    }

    @GetMapping("/busca")
    public ModelAndView index() {
        List<Ponto> listaPonto = this.pontoRepository.findAll();
        ModelAndView mv = new ModelAndView("pontos/listarPonto");
        mv.addObject("listaPonto", listaPonto);
        return mv;
    }

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("pontos/home");
        return mv;
    }

    @GetMapping("/pontos/{id}/pontosUpdate")
    public ModelAndView edit(@PathVariable Long id, RequisicaoPonto requisicaoponto){
        Optional<Ponto> optional = this.pontoRepository.findById(id);
        if(optional.isPresent()){
            Ponto ponto = optional.get();
            requisicaoponto.fromPonto(ponto);
            ModelAndView mv = new ModelAndView("pontos/pontoUpdate");
            mv.addObject("pontoId", ponto.getId());
            return mv;
        }
        else{
            return new ModelAndView("redirect: listarPonto");
        }
    }
    @PostMapping("/pontos/{id}/pontosUpdate")
    public ModelAndView update(@PathVariable Long id, RequisicaoPonto requisicaoPonto){
        Optional<Ponto> optional = this.pontoRepository.findById(id);

        if(optional.isPresent()){
            Ponto ponto = optional.get();
            ponto.setCep(requisicaoPonto.getCep());
            ponto.setBairro(requisicaoPonto.getBairro());
            ponto.setNomeLocalidade(requisicaoPonto.getNomeLocalidade());
            ponto.setNumero(requisicaoPonto.getNumero());
            ponto.setEstado(requisicaoPonto.getEstado());
            ponto.setLatitude(-22.883141);
            ponto.setLongitude(-47.210918);
            pontoRepository.save(ponto);

        }
        return new ModelAndView("redirect:/busca");

    }

    @PostMapping("/pontos/{id}/delete")
    public ModelAndView delete(@PathVariable Long id, Ponto ponto){
        Optional<Ponto> optional = this.pontoRepository.findById(id);

        if(optional.isPresent()){
            pontoRepository.delete(ponto);
        }
        return new ModelAndView("redirect:/busca");

    }


}
