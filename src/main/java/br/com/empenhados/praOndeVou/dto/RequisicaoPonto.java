package br.com.empenhados.praOndeVou.dto;

import br.com.empenhados.praOndeVou.models.Ponto;
import br.com.empenhados.praOndeVou.models.Usuario;

public class RequisicaoPonto {
    private String cep;
    private int numero;
    private String bairro;
    private String estado;
    private String nomeLocalidade;


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeLocalidade() {
        return nomeLocalidade;
    }

    public void setNomeLocalidade(String nomeLocalidade) {
        this.nomeLocalidade = nomeLocalidade;
    }


    public Ponto toPonto(){
        Ponto ponto = new Ponto();
        ponto.setEstado(this.estado);
        ponto.setNumero(this.numero);
        ponto.setBairro(this.bairro);
        ponto.setNomeLocalidade(this.nomeLocalidade);
        ponto.setCep(this.cep);

        return ponto;
    }


    public void fromPonto(Ponto ponto){
        this.bairro = ponto.getBairro();
        this.cep = ponto.getCep();
        this.estado = ponto.getEstado();
        this.bairro = ponto.getBairro();
        this.nomeLocalidade = ponto.getNomeLocalidade();
    }


    @Override
    public String toString() {
        return "RequisicaoPonto{" +
                "cep='" + cep + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", nomeLocalidade='" + nomeLocalidade + '\'' +
                '}';
    }
}
