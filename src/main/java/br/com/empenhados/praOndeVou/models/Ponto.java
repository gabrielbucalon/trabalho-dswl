package br.com.empenhados.praOndeVou.models;

import javax.persistence.*;

@Entity
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cep;
    private int numero;
    private String bairro;
    private String estado;
    private String nomeLocalidade;
    private double latitude;
    private double longitude;
    private long usuario_id;

    public Ponto(){ }

    public Ponto(String cep, int numero, String bairro, String estado,
                 String nomeLocalidade, double latitudade, double lontitude, long usuario_id) {
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.nomeLocalidade = nomeLocalidade;
        this.latitude = latitudade;
        this.longitude = lontitude;
        this.usuario_id = usuario_id;
    }

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(long usuario_id) {
        this.usuario_id = usuario_id;
    }

    @Override
    public String toString() {
        return "Pontos{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", nomeLocalidade='" + nomeLocalidade + '\'' +
                ", latitudade=" + latitude +
                ", lontitude=" + longitude +
                ", usuario_id=" + usuario_id +
                '}';
    }
}
