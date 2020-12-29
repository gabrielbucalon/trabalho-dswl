package br.com.empenhados.praOndeVou.models;

public class Pontos {
    private long id;
    private String cep;
    private int numero;
    private String bairro;
    private String estado;
    private String nomeLocalidade;
    private double latitudade;
    private double lontitude;
    private long usuario_id;

    public Pontos(){ }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getLatitudade() {
        return latitudade;
    }

    public void setLatitudade(double latitudade) {
        this.latitudade = latitudade;
    }

    public double getLontitude() {
        return lontitude;
    }

    public void setLontitude(double lontitude) {
        this.lontitude = lontitude;
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
                ", latitudade=" + latitudade +
                ", lontitude=" + lontitude +
                ", usuario_id=" + usuario_id +
                '}';
    }
}
