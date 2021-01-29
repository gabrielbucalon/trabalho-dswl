package br.com.empenhados.praOndeVou.dto;

import br.com.empenhados.praOndeVou.models.Ponto;
import br.com.empenhados.praOndeVou.models.Usuario;

public class RequisicaoUsuario
{
    private String nome;
    private int idade;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario toUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome(this.nome);
        usuario.setIdade(this.idade);
        usuario.setEmail(this.email);
        usuario.setSenha(this.senha);

        return usuario;
    }

    public void fromUsuario(Usuario usuario){
        this.nome = usuario.getNome();
        this.idade = usuario.getIdade();
        this.email = usuario.getEmail();;
        this.senha = usuario.getSenha();
    }

    @Override
    public String toString() {
        return "RequisicaoUsuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
