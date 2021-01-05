package br.com.empenhados.praOndeVou.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pontos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cep;
    private String rua;
    private int numero;
    private String bairro;
    private String estado;

    public Pontos(String cep, String rua, int numero, String bairro, String estado, String nomeLocalidade, boolean favorito) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.nomeLocalidade = nomeLocalidade;
        this.favorito = favorito;
    }

    public int getId() {
        return id;
    }

    public Pontos() {
    }

    public Pontos(int id, String cep, String rua, int numero, String bairro, String estado, String nomeLocalidade, boolean favorito) {
        this.id = id;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.nomeLocalidade = nomeLocalidade;
        this.favorito = favorito;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nomeLocalidade;
    private boolean favorito;

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNomeLocalidade(String nomeLocalidade) {
        this.nomeLocalidade = nomeLocalidade;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

    public String getNomeLocalidade() {
        return nomeLocalidade;
    }

    public boolean isFavorito() {
        return favorito;
    }
}
