package br.com.empenhados.praOndeVou.controllers;

import br.com.empenhados.praOndeVou.dto.RequisicaoUsuario;
import br.com.empenhados.praOndeVou.models.Usuario;
import br.com.empenhados.praOndeVou.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class UsuariosController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Listar usuários
    @GetMapping("/pontos/usuariosRead")
    public ModelAndView index() {
        List<Usuario> usuarios = this.usuarioRepository.findAll();
        ModelAndView mv = new ModelAndView("pontos/usuariosRead");
        mv.addObject("usuarios", usuarios);

        return mv;
    }


    // Redireciona usuário para pagina de cadastrar um novo ponto.
    @GetMapping("/pontos/novo")
    public String neww() {
        return "pontos/novo";
    }

    // Criar um novo usuario
    @PostMapping("/pontos/novo")
    public String create(RequisicaoUsuario requisicaoUsuario){
        Usuario usuario = requisicaoUsuario.toUsuario();
        usuarioRepository.save(usuario);
        return "redirect:usuariosRead";
    }

    @GetMapping("/pontos/{id}/usuariosUpdate")
    public ModelAndView edit(@PathVariable Long id, RequisicaoUsuario requisicaoUsuario){
        Optional<Usuario> optional = this.usuarioRepository.findById(id);
        if(optional.isPresent()){
            Usuario usuario = optional.get();
            requisicaoUsuario.fromUsuario(usuario);
            ModelAndView mv = new ModelAndView("pontos/usuariosUpdate");
            mv.addObject("usuarioId", usuario.getId());
            System.out.println(usuario.getEmail());
            return mv;
        }
        else{
            return new ModelAndView("redirect: usuariosRead");
        }
    }

    @GetMapping("/pontos/{id}")
    public ModelAndView show(@PathVariable Long id){
        Optional<Usuario> optional = this.usuarioRepository.findById(id);

        if(optional.isPresent()){
            Usuario usuario = optional.get();
            ModelAndView mv = new ModelAndView("pontos/usuariosDetail");
            mv.addObject("usuario", usuario);
            return mv;
        }
        else{
            return new ModelAndView("redirect: usuariosRead");
        }
    }

    @PostMapping("/pontos/{id}/usuariosUpdate")
    public ModelAndView update(@PathVariable Long id, RequisicaoUsuario requisicaoUsuario){
        Optional<Usuario> optional = this.usuarioRepository.findById(id);

        if(optional.isPresent()){
            Usuario usuario = optional.get();
            usuario.setNome(requisicaoUsuario.getNome());
            usuario.setIdade(requisicaoUsuario.getIdade());
            usuario.setEmail(requisicaoUsuario.getEmail());
            usuario.setSenha(requisicaoUsuario.getSenha());
            usuarioRepository.save(usuario);
            return new ModelAndView("/pontos/usuariosRead");
        }
        else{
            return new ModelAndView("/pontos/usuariosRead");
        }
    }

    @PostMapping("/pontos/{id}/usuariosDetail")
    public ModelAndView delete(@PathVariable Long id, Usuario usuario){
        Optional<Usuario> optional = this.usuarioRepository.findById(id);

        if(optional.isPresent()){
            usuarioRepository.delete(usuario);
            return new ModelAndView("/pontos/usuariosRead");
        }
        else{
            return new ModelAndView("/pontos/usuariosRead");
        }
    }

}
